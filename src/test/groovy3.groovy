package test

/**
 * Created by ttatu on 11/26/2014.
 */
class groovy3 {

   /* def interleave(String a, String b) {
        int maxlength = [a.size(), b.size()].max()
        def sb = new StringBuffer()
        (0..<maxlength).each{
            if (it < a.size()) sb << a[it]
            if (it < b.size()) sb << b[it]
        }
        sb
    }*/


    static void main(args){
        println('Hello ${text4}')
        assert true
        assert 1==1

        def x = 1
        assert x==1

        def y = 2; assert y==2

        def z = 1234
        assert z =~ /\d+/

        asser 'xxxx' == '12345'.replaceAll(/\d/,'x')





        //println interleave('Hello', 'World!')
    }
}
