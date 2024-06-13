import java.util.*; 
class PrrscaleTriangele{
   public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        // Store the entire Pascal's Triangle
        for (int row = 1; row <= numRows; row++) {
            ans.add(pascalTriangleRow(row));
        }
        return ans;
    }

    public static List<Integer> pascalTriangleRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1); // inserting the 1st element

        // Calculate the rest of the elements
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }

    public static void main(String[] args) {
        PrrscaleTriangele solution = new PrrscaleTriangele();
        int numRows = 5;
        List<List<Integer>> triangle = solution.generate(numRows);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}