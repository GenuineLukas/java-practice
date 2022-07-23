package ToStringExample;

public class ParentClass {
    int classNum;
    String name;
    int testScore;

    public ParentClass(int classNum, String name, int testScore) {
        this.classNum = classNum;
        this.name = name;
        this.testScore = testScore;
    }
    @Override
    public String toString() {
        return "class number: " + classNum + " name: " + name + " testScore: " + testScore;
    }
}

