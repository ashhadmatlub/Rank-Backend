package Backend.student;

public class Student {
    private String names, seatNo;
    private double marks;
    private int rank;

    public Student(String SeatNo, String Name, double Marks) {
        this.seatNo = SeatNo;
        this.names = Name;
        this.marks = Marks;
    }

    public String getNames() {
        return names;
    }

    public String getSeatNo() {
        return seatNo;
    }

    // public int getCs_code() {
    // return cs_code;
    // }

    public Double getMarks() {
        return marks;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "ID: " + seatNo +
                ", Name: " + names +
                ", Marks: " + marks +
                ", Rank: " + rank;
    }
}
