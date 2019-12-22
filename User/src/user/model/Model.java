package user.model;

    import java.util.List;

    public interface Model {

        void save(Object obj);

        void delete(int id);

        void update(Object obj, int id);

        List getAll();

        Object getSingle(int id);

    }