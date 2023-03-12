package q1lab4;

class equals {
 
    private double re, im;
 
    public equals (double re, double im) {
        this.re = re;
        this.im = im;
    }
 

    @Override
    public boolean equals(Object o) {
 

        if (o == this) {
            return true;
        }

        if (!(o instanceof equals )) {
            return false;
        }


        equals  c = (equals ) o;
         

        return Double.compare(re, c.re) == 0
                && Double.compare(im, c.im) == 0;
    }
}