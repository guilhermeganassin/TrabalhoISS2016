package bolaoweb.controller;

import bolaoweb.model.Campeonato;
import bolaoweb.modelDAO.CampeonatoDAO;

import java.util.List;
import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.swing.JOptionPane;


@ManagedBean
@SessionScoped
public class CampeonatoBEAN {

    private Campeonato campeonato = new Campeonato();
    private CampeonatoDAO campeonatoDAO = new CampeonatoDAO();
    private List<Campeonato> listaCampeonato;
    public String filtro;

    public CampeonatoBEAN() {
        setFiltro("");
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.campeonato);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CampeonatoBEAN other = (CampeonatoBEAN) obj;
        if (!Objects.equals(this.campeonato, other.campeonato)) {
            return false;
        }
        return true;
    }

    public String inserirCampeonato() {
        if ((campeonato.getDatafim() == null) || (campeonato.getDatainicio() == null)) {
            return "cadastro_campeonato";
        }

        if (validarData()) return "cadastro_campeonato";

        listaCampeonato = campeonatoDAO.getLista(campeonato.getNome());
        if (listaCampeonato.size() > 0) {
            return "cadastro_campeonato";
        }

        campeonatoDAO.inserirCampeonato(campeonato);
        return "consulta_campeonato";
    }

    //Metodo de validação de data
    private boolean validarData() {
        if (campeonato.getDatafim().before(campeonato.getDatainicio())) {
            return true;
        }
        return false;
    }

    public String editarCampeonato() {
        if (validarData()) return "cadastro_campeonato";

        campeonatoDAO.editarCampeonato(campeonato);
        return "consulta_campeonato";
    }

    public String excluirCampeonato(Campeonato c) {
        campeonatoDAO.excluirCampeonato(c);
        return "consulta_campeonato";
    }

    public List listarCampeonato() {
        listaCampeonato = campeonatoDAO.getLista(filtro);
        return this.listaCampeonato;
    }

    public List listaCampeonato() {
        listaCampeonato = campeonatoDAO.getList();
        return this.listaCampeonato;
    }

    public String carregaCampeonato(Campeonato c) {
        campeonato = c;
        return "cadastro_campeonato";
    }

    public String novoCampeonato() {
        campeonato = new Campeonato();
        return "cadastro_campeonato";
    }

    public String confirmarCampeonato() {
        if (listaCampeonato.contains(campeonato)) {
            return editarCampeonato();
        }
        return inserirCampeonato();
    }
}
