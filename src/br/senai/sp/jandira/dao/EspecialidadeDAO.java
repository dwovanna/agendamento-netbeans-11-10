package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {
    
    private final static String URL = "C:\\Users\\22282185\\java";
    private final  static Path PATH = Paths.get(URL);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }

        return null;
    }

    public static void gravar(Especialidade e) {
        especialidades.add(e);
        
        //*** GRAVAR EM ARQUIVO  ***
        try {
            BufferedWriter escritor;
            escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException erro) {
        }
    }

    public static void exclui(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (codigo == e.getCodigo()) {
                especialidades.remove(e);
                break;
            }
        }
    }

    public static void atualizar(Especialidade correta) {
        for (Especialidade e : especialidades) {
            if (correta.getCodigo() == e.getCodigo()) {
                int posicao = especialidades.indexOf(e);
                especialidades.set(posicao, correta);
            }
        }

    }

    // Criar lista inicial de especialidades
    public static void criarListaDeEspecialidades() {
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while(linha != null) {
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(vetor[1], vetor[2], Integer.valueOf(vetor[0]));
                
                // Guardar a especialidade na lista
                especialidades.add(e);
                // ler a pr??xima linha
                linha = leitor.readLine();
                
            }
            
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }
        Especialidade e1 = new Especialidade("Cardiologia", "Parte da medicina que cuida do cora????o");
        Especialidade e2 = new Especialidade("Nefrologia", "Parte da medicina que cuida do rim");
        Especialidade e3 = new Especialidade("Otorronolaringologia", "Parte da medicina que cuida de doen??as no ouvido");
        Especialidade e4 = new Especialidade("Pediatria", "Parte da medicina que cuida das crian??as");

        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);

    }

    public static DefaultTableModel getEspecialidadesModel() {

        String[] titulos = {"CODIGO", "NOME DA ESPECIALIDADE", "DESCRI????O"};

        String[][] dados = new String[especialidades.size()][3];
        
        int i = 0;
        for (Especialidade e : especialidades) {
            
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;

        }

        DefaultTableModel model = new DefaultTableModel(dados, titulos);

        return model;
    }

    public static void excluir(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class BuffereReader {

        public BuffereReader() {
        }
    }

 
}
