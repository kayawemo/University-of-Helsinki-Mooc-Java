
import java.text.MessageFormat;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayod
 */
public class TodoList {

    private ArrayList<String> todos;
    
    public TodoList() {
        this.todos = new ArrayList<>();
    }
    
    public void add(String task) {
        this.todos.add(task);
    }
    
    public void print(){
        for (int i = 0; i < todos.size(); i++) {
            System.out.println(MessageFormat.format("{0}: {1}", i + 1, todos.get(i)));
        }
//        for (String todo : todos) {
//            System.out.println(MessageFormat.format("{0}: {1}", todo.indexOf(todo) + 1, todo));
//        }
    }
    
    public void remove(int number) {
        todos.remove(number - 1);
    }
}
