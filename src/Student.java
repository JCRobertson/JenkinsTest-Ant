
public class Student {

		private String name;
		private int favoriteNumber;
		
		public Student(String name, int favoriteNumber){
			if(name.equals(null))
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
		public boolean equals(Object o){
			if(!(o instanceof Student))
				return false;
		}
}
