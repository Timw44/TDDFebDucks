public class Ducks
{
        private String color;
        private int age;

        public Ducks(String color, int age)
        {
            this.color = color;
            this.age = age;
        }

        public Ducks()
        {
            this.color = "";
            this.age = 0;
        }

        public String duckSays()
        {
            if(age <= 4)
            {
                return "Peep";
            }
            return "Quack";
        }

        public String getColor() {
            return color;
        }

        public int getAge() {
            return age;
        }

        public void setColor(String color)
        {
            this.color = color;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String toString()
        {
            return "Ducks{" + "Color: " + color + ", Age: " + age + "}";
        }
}
