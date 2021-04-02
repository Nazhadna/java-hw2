package chapter3;

public class Department {

    public double average(Measurable[] meas) {
        double sum=0;
        for (Measurable m : meas)
            sum+=m.getMeasure();
        return sum/meas.length;
    }

    public Measurable largest(Measurable[] meas) {
        double maxMeas = 0;
        int index = 0;
        for (int i=0; i<meas.length; i++)
        {
            if (meas[i].getMeasure() > maxMeas) {
                maxMeas = meas[i].getMeasure();
                index = i;
            }
        }
        return meas[index];
    }
}
