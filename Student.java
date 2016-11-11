package cs520.hw3.part2;

public class Student {
private String name;
private int homework1, homework2, homework3, homework4, homework5, homework6;

public Student(String name){//constructor with argument of name
	this.name = name;
}

/**
 * @param homework1 the homework1 to set
 */
public void setHomework1(int homework1) {
	this.homework1 = homework1;
}


/**
 * @param homework2 the homework2 to set
 */
public void setHomework2(int homework2) {
	this.homework2 = homework2;
}

/**
 * @param homework3 the homework3 to set
 */
public void setHomework3(int homework3) {
	this.homework3 = homework3;
}

/**
 * @param homework4 the homework4 to set
 */
public void setHomework4(int homework4) {
	this.homework4 = homework4;
}

/**
 * @param homework5 the homework5 to set
 */
public void setHomework5(int homework5) {
	this.homework5 = homework5;
}

/**
 * @param homework6 the homework6 to set
 */
public void setHomework6(int homework6) {
	this.homework6 = homework6;
}

public double computeAverage (){
	double computedAverage=(homework1 + homework2 + homework3 + homework4 + homework5 + homework6);
	return (computedAverage/6);
}

public String tostring(){
	return "The " + name + "'s average grade is " + String.format("%.2f", computeAverage());
}

}
