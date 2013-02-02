
public class Student {

		private String name;
		private int favoriteNumber;
		
		public Student(String name, int favoriteNumber){
			if(name==null)
				throw new NullPointerException();
			if(name.equals("") || favoriteNumber<0)
				throw new IllegalArgumentException();
			this.name = name;
			this.favoriteNumber = favoriteNumber;
		}
		
		public String getName() {
			return name;
		}

		public int getFavoriteNumber() {
			return favoriteNumber;
		}

		@Override
		public String toString(){
			return name+" "+favoriteNumber;
		}
		
		@Override
		public boolean equals(Object o){
			if(!(o instanceof Student))
				return false;
			Student s = (Student) o;
			if(s.getName().equals(this.getName()) && s.getFavoriteNumber()==this.favoriteNumber)
				return true;
			return false;
		}
		
		@Override
		public int hashCode(){
			return name.hashCode()+favoriteNumber*47;
		}
}
