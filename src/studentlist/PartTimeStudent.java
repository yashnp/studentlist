/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author hp
 */
public class PartTimeStudent extends Student {
    
    private int numCourses;
    public PartTimeStudent(String name, int numCourses){
        super(name);
        this.numCourses= numCourses;
    }
    public int getNumCourses(){
        return numCourses;
    }
    public void setNumCourses(){
        return numCourses;
    }
    
}
