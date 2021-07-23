/*
Create the commonStudents() method of the MyUtils class to return a HashSet of common elements of two student lists.
For example, for a given list1 [Students [id=1, name=Ivan], Students [id=2, name=Petro], Students [id=3, name=Stepan]]
and list2 [Students [id=1, name=Ivan], Students [id=3, name=Stepan], Students [id=4, name=Andriy]]
you should get [Students [id=3, name=Stepan], Students [id=1, name=Ivan]].
 */

package com.softserve.edu.HW3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class MyUtils5 {
    public static class Student {
        private int id;
        private String name;
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            boolean result = true;
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Student other = null;
            if (obj instanceof Student) {
                other = (Student) obj;
            }
            if ((other == null) || (id != other.id)) {
                return false;
            }
            if ((name == null) && (other.name != null)
                    || (name != null) && (other.name == null)) {
                return false;
            }
            if (result && (name != null)) {
                result = result && name.equals(other.name);
            }
            return result;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + id;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }

        @Override
        public String toString() {
            return "Students [" + "id=" + id + ", name=" + name + "]";
        }
    }
    public Set<Student> commonStudents(List<Student> list1, List<Student> list2) {
        list1.retainAll(list2);
        HashSet<Student> comElem = new HashSet<>(list1);
        return comElem;
    }
}