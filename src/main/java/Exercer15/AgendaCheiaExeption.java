//Exercicios Aulas 52.4::
package Exercer15;
public class AgendaCheiaExeption extends Exception {
    @Override
    public String getMessage(){
        return "Agenda ja esta cheia";
    }
}
