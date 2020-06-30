public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastValue() {
        return (this.grades[this.size-1]);
    }

    public double averageValue() {
        double result = 0;
        for (int i = 0; i < this.size; i++) {
            result = result + grades[i];
        }
        return result / this.size;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(1);
        grades.add(5);
        grades.add(4);

        System.out.println(grades.lastValue());
        System.out.println(grades.averageValue());
    }
}
