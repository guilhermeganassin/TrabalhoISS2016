package bolaoweb.modelDAO;


import bolaoweb.hibernate.HibernateUtil;
import bolaoweb.model.Times;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class TimesDAO {

  private Session session;
  private Transaction trans;
  private List<Times> listaTimes;

  public List<Times> getList() {
    session = HibernateUtil.getSessionFactory().openSession();

    Criteria criteria = session.createCriteria(Times.class);
    this.listaTimes = criteria.list();

    return this.listaTimes;
  }
  
  public List<Times> getLista( String filtro ){
        session = HibernateUtil.getSessionFactory().openSession();

        Criteria crit = session.createCriteria(Times.class);

        Criterion filtroNome = Restrictions.like("Nome",filtro+"%");

        crit.add(filtroNome);

        this.listaTimes = crit.list();
        return listaTimes;
    }

  public void incluirTime(Times equipe) {
    try {
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction trans = session.beginTransaction();

      session.save(equipe);
      trans.commit();
      session.close();

    } catch (HibernateException ex) {
      ex.printStackTrace();
    }
  }

  public void alterarTime(Times equipe) {
    try {
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction trans = session.beginTransaction();

      session.merge(equipe);
      trans.commit();
      session.close();

    } catch (HibernateException ex) {
      ex.printStackTrace();
    }
  }

  public void excluirTime(Times equipe) {
    try {
      Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction trans = session.beginTransaction();

      session.delete(equipe);
      trans.commit();
      session.close();

    } catch (HibernateException ex) {
      ex.printStackTrace();
    }
  }
}
