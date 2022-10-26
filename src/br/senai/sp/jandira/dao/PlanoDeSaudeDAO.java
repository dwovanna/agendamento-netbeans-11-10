
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.ui.PlanodeSaudePanel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static sun.jvm.hotspot.HelloWorld.e;


public class PlanoDeSaudeDAO {
    
    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();
    private static int titulo;
    
    public static ArrayList<PlanoDeSaude> getPlanoDeSaude() {
        return planoDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo){
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo() == codigo) {
                return e;
            }
    }
        
        return null;
        
    }

    public static void gravar(PlanoDeSaude e) {
        planoDeSaude.add(e);
    }
    
     public static void exclui(Integer codigo) {
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo().equals(codigo)) {
                planoDeSaude.remove(e);
                break;
            }
        }
    }

    public static void atualizar(PlanoDeSaude correta) {
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo().equals(correta)) {
                int posicao = planoDeSaude.indexOf(e);
                planoDeSaude.set(posicao, correta);
            }
        }
    }

    public static void criarListaDePlanoDeSaude() {
       PlanoDeSaude e1 = new PlanoDeSaude("Notridame", "Basico", "116", LocalDate.of(2022, 11, 16));
        PlanoDeSaude e2 = new PlanoDeSaude("Profisson", "Premium", "321", LocalDate.of(2022, 12, 15));
        PlanoDeSaude e3 = new PlanoDeSaude("Division", "Rápido", "213", LocalDate.of(2022, 9, 10));
        PlanoDeSaude e4 = new PlanoDeSaude("Mutiplican", "Obriquin", "123", LocalDate.of(2022, 8, 14));

        planoDeSaude.add(e1);
        planoDeSaude.add(e2);
        planoDeSaude.add(e3);
        planoDeSaude.add(e4);
    }
    
    public static DefaultTableModel getPlanoDeSaudeModel() {

        String[] titulos = {"OPERADORA", "CATEGORIA", "NUMERO", "VALIDADE"};

        String[][] dados = new String[planoDeSaude.size()][5];
        
        int i = 0;
        for (PlanoDeSaude e : planoDeSaude) {
            
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getCategoria();
            dados[i][2] = e.getNumero();
            dados[i][3] = e.getOperadora();
            
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            dados[i][4] = e.getValidade().format(barra);
            
            i++;

        }
        
        return new DefaultTableModel(dados, titulo);
    
   
    }

    
}
