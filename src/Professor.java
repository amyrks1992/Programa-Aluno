public class Professor extends Pessoa {
    private String disciplina;
    private int ID;

    public void setDisciplina(String disciplina){

        this.disciplina = disciplina;
    }

    public String getDisciplina(){

        return disciplina;
    }

    public void setID(int ID){

        this.ID = ID;
    }

    public int getID(){

        return ID;
    }
}
