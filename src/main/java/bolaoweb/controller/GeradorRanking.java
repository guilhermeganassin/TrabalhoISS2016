package bolaoweb.controller;


import bolaoweb.model.Apostador;
import bolaoweb.modelDAO.ApostadorDAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author Guilherme
 */
@ManagedBean
@SessionScoped
public class GeradorRanking {
    private Apostador apostador = new Apostador();
    private ApostadorDAO apostadorDAO = new ApostadorDAO();
    private List<Apostador> listaApostador;
    public String filtro;
    private int aux = 0;
    private int aux2 = 0;
    
    public void gerarRanking(){
    
    listaApostador = apostadorDAO.getLista("");
    while(aux < listaApostador.size()){
    aux2 = aux +1;    
    apostador = listaApostador.get(aux);
    apostador.setPosicao(aux2);
    apostadorDAO.editarApostador(apostador);
    aux = aux +1;
    }
    
    }

    public GeradorRanking() {
    }
    
    
}
