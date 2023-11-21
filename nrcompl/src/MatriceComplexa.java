public class MatriceComplexa {
    NumarComplex [][] m;
    public MatriceComplexa(int rows, int cols){
        m = new NumarComplex[rows][cols];

    }
    public MatriceComplexa add(MatriceComplexa a)
    {
        int rows = m.length;
        int cols = m[0].length;
        MatriceComplexa res = new MatriceComplexa(rows, cols);
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                res.m[i][j] = m[i][j].adunare(a.m[i][j]);
            }
        }
        return res;
    }

    public MatriceComplexa sub(MatriceComplexa a)
    {
        int rows = m.length;
        int cols = m[0].length;
        MatriceComplexa res = new MatriceComplexa(rows, cols);
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                res.m[i][j] = m[i][j].scadere(a.m[i][j]);
            }
        }
        return res;
    }

    public MatriceComplexa mul(int x)
    {
        int rows = m.length;
        int cols = m[0].length;
        MatriceComplexa res = new MatriceComplexa(rows, cols);
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                res.m[i][j] = m[i][j].inm_scalar(x);
            }
        }
        return res;
    }
}



