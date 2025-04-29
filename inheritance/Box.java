class Box{
    double w;
    double h;
    double l;

    Box(double w, double h, double l){
        this.w = w;
        this.h = h;
        this.l = l;
    }

    Box(Box b){
        this.w = b.w;
        this.h = b.h;
        this.l = b.l;
    }   
}