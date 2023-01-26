import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        File maze1 = new File("src/maze1.txt");//10*12 maze
        File maze2 = new File("src/maze2.txt");//
        File maze3 = new File("src/maze3.txt");//This maze has no exit therefore there is no *
        File maze4 = new File("src/maze4.txt");
        File maze5 = new File("src/maze5.txt");// This maze has no exit therefore there is no *
        File maze6 = new File("src/maze6.txt"); // 15*15 maze
        //execute(maze5);
        execute(maze6);
    }

    private static void execute(File file) throws Exception {
        Maze maze = new Maze(file);
        System.out.println("DFS: ");
        dfs(maze);
        System.out.println("BFS: ");
        bfs(maze);
    }

    private static void bfs(Maze maze) {
        BFS bfs = new BFS();
        List<Coordinate> path = bfs.solve(maze);
        maze.printPath(path);
        maze.reset();
    }

    private static void dfs(Maze maze) {
        DFS dfs = new DFS();
        List<Coordinate> path = dfs.solve(maze);
        maze.printPath(path);
        maze.reset();
    }
}