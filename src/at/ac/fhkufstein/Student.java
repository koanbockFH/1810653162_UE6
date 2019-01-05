package at.ac.fhkufstein;

public class Student
{
    private String name;
    private String matrikelnummer;
    private int jahrgang;

    Student(String name, String matrikelnummer, int jahrgang)
    {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.jahrgang = jahrgang;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getMatrikelnummer()
    {
        return matrikelnummer;
    }

    public void setMatrikelnummer(String matrikelnummer)
    {
        this.matrikelnummer = matrikelnummer;
    }

    public int getJahrgang()
    {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang)
    {
        this.jahrgang = jahrgang;
    }

    @Override
    public String toString()
    {
        return String.format("Name: %s; Matrikelnummer: %s; Jahrgang: %d", getName(), getMatrikelnummer(),
                getJahrgang());
    }
}
