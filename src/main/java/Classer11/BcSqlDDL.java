package Classer11;

public interface BcSqlDDL {
    void create(String query);
    void alter(String query);
    void drop(String query);
}
