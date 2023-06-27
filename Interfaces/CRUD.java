package Interfaces;

public interface CRUD<Tipo> {
    void insert(Tipo objeto);
    Tipo select(int id);
    void update(Tipo objeto);
    void delete(int id);
}

