package com.Iteratormode;

import com.Iteratormode.college.College;
import com.Iteratormode.college.ComputerCollege;
import com.Iteratormode.college.MucisCollege;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<>();
        collegeList.add(new ComputerCollege());
        collegeList.add(new MucisCollege());

        OutputImpl output = new OutputImpl(collegeList);
        output.iterCollege();
    }
}
