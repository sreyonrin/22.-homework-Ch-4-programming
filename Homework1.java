package homework;

public class Homework1 {
	public static void main(String[]args) {
		String[] employee = { "Doung", "Chan", "Minea", "Mesa", "Romdoul", "Veha", "Por", "Kanika" };
        int[] salary = { 560, 560, 500, 500, 190, 190, 560, 700 };
        int[] newSuper = new int[salary.length - 1];
        String[] employeeSalary = new String[employee.length - 1];
        int max = salary[0];
        int min = salary[0];
        int average = 0;
        int sum = 0;
        
        for(int i = 0; i < salary.length;i++) {
        	if(max < salary[i]) {
        		max = salary[i];
        	}
        	if(min > salary[i]) {
        		min = salary[i];
        	}
        }
        System.out.println("1.Employee who has highest salary:");
       for(int k = 0 ;k < employee.length; k++) {
    	   if(max == salary[k]) {
    		   System.out.println(employee[k] + " has the highest salary of " + "$" + max);
    	   }
       }
       System.out.println("...................................");
       
       
       
       System.out.println("2.Employee who has lawest salary:");
       for(int k = 0 ; k < employee.length; k++) {
    	   if(min == salary[k]) {
    		   System.out.println(employee[k] + " has the lawest salary of " + "$" + min);
    	   }
       }
       System.out.println("...................................");
       
       
       
       System.out.println("3.Employee who has lowest salary than average: 470.0");
       for(int k = 0 ; k < employee.length; k++) {
    	   if(min == salary[k]) {
    		   sum += salary[k];
    		   average = sum / salary[k];
    		   System.out.println(employee[k] + " : " + " " + "$" + min);
    	   }
       }
       System.out.println("...................................");
       
       
       
       System.out.println("4.Employee who has higher salary than average: 470.0");
       for(int k = 0 ; k <employee.length; k++) {
    	   if(salary[k] > min) {
    		   sum += salary[k];
    		   average = sum /salary[k];
    		   System.out.println(employee[k] + ":" + " " + "$" + salary[k]);
    	   }
       }
       System.out.println("...................................");
       
       
       
       
       
       
       System.out.println("5.Employee who has same salary:");
       for (int i = 0; i < salary.length; i++) {
           for (int k = 1; k < salary.length; k++) {
               if (salary[i] == salary[k] && i != k) {
                   newSuper[i] = salary[i];
                   employeeSalary[i] = employee[i];
                   break;
               }
           }
       }
       sortToArray(newSuper, employeeSalary);
   }
	 static public void sortToArray(int[] salary, String[] names) {
	     int temp;
	     String step;
	     for (int i = 0; i <= salary.length - 1; i++) {
	         for (int k = 0;k <= salary.length - 2; k++) {
	             if (salary[k] < salary[k + 1]) {
	                 temp = salary[k];
	                 salary[k] = salary[k + 1];
	                 salary[k + 1] = temp;
	                 step = names[k];
	                 names[k] = names[k + 1];
	                 names[k + 1] = step;
	             }
	         }
	     }
	     for (int i = 0; i <= salary.length - 1; i++) {
	         System.out.println(names[i] + ":" + salary[i] + "$");
		}   
       System.out.println("...................................");
		
       
       int [] num = new int[15];
		int counts = 0;
		String index = " ";
		for(int i = 0 ; i < num.length; i++) {
			int random = (int) (Math.random() * 11 + 0);
			num[i] = random;
			System.out.print(num[i] + " ");
			if(num[i] == 5) {
				counts++;
				index = index + i +" ";
			}
			
		}
		System.out.println();
		if(counts != 0) {
			System.out.println("There are " + counts + " number 5 found in index as bellow: ");
			System.out.println("Index: " + index);
		}else {
			System.out.println("Number 5 not found!");
		}       
		
	}

}





