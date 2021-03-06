package bolaoweb.modelDAO;

import bolaoweb.hibernate.HibernateUtil;
import bolaoweb.model.Apostador;
import java.io.PrintStream;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class ApostadorDAO {

    private Session session;
    private Transaction trans;
    private List<Apostador> listaApostador;

    public List<Apostador> getLista( String filtro ){
        session = HibernateUtil.getSessionFactory().openSession();

        Criteria crit = session.createCriteria(Apostador.class, "apostador");
        crit.addOrder(Order.desc("apostador.Pontuacao"));

        this.listaApostador = crit.list();
        return listaApostador;
    }
    
    public void inserirApostador( Apostador apostador ){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();

            session.save(apostador);
            trans.commit();
        } catch ( Exception e ){           
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void editarApostador( Apostador apostador ){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();

            session.update(apostador);
            trans.commit();
        } catch( Exception e ){
            e.printStackTrace();
        } finally{
            session.close();
        }
    }

    public void excluirApostador( Apostador apostador ){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();

            session.delete(apostador);
            trans.commit();
        } catch( Exception e ){
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
