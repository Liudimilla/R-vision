package Classer11;

public interface BancoDados extends BcSqlDDL,BcSqlDML,BcSqlDCL{
    void abrirConexao();
    void fecharConexao();
}
