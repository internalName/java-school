import ru.rzn.sbt.javaschool.lesson3.army.Warrior;
import ru.rzn.sbt.javaschool.lesson3.army.Weapon;
import ru.rzn.sbt.javaschool.lesson3.army.WeaponType;
import ru.rzn.sbt.javaschool.lesson3.hobby.Biker;
import ru.rzn.sbt.javaschool.lesson3.hobby.DetectionResult;
import ru.rzn.sbt.javaschool.lesson3.hobby.Rockstar;
import ru.rzn.sbt.javaschool.lesson3.hobby.Student;

import java.util.Objects;

public class tests {
    public static void main(String[] args) {
        int a=0;

        if(a++==0) System.out.println(a);

    }

    public static DetectionResult detect(Object[] students) {
        if(students==null) return null;

        int countPure=0;
        int countRockstar=0;
        int countBiker=0;

        for (int i=0;i<students.length;i++){
            if(students[i]!=null){
                if(students[i] instanceof Rockstar) countRockstar++;
                else if(students[i] instanceof Biker) countBiker++;
                else if(students[i] instanceof Student)countPure++;
            }
        }
        return new DetectionResult(countPure,countRockstar,countBiker);
    }
}
