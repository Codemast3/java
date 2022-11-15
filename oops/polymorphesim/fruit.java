class apple{
    public void taste() {
        System.out.println("sweet");
        
    }
}
class seed extends apple{
    public void taste(){
        System.out.println("bitter");
    }
}
class fruit{
    public static void main(String[] args) {
        apple myApple = new apple();
        apple myseed = new seed();
        myApple.taste();
        myseed.taste();
    }
}