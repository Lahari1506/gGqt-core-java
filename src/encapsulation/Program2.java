package encapsulation;
		class dog{
			private String name;
			private String color;
			private String breed;
			private int age;
			private int cost;
			
			void setData(String name,String color,String breed,int age, int cost) {
				name=name;
				color=color;// in these cases the compiler doesnt know which one is instance variable and which one is local variable
				//to rectify this proble we use shadowing problem
				breed=breed;
				age=age;
				cost=cost;
			}
			void getData() {
				System.out.println("name = "+name);
				System.out.println("color = "+color);
				System.out.println("breed = "+breed);
				System.out.println("age = "+age);
				System.out.println("cost = "+cost);
			}
			
			
		}
		public class Program2 {

			public static void main(String[] args) {
				dog d=new dog();
				d.setData("rock", "red", "pug", 20, 30000);
				d.getData();
	}

}
