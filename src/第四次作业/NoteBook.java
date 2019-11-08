package 第四次作业;

import java.util.ArrayList;
//类的接口设计；
public class NoteBook {
    private ArrayList<String> notes=new ArrayList<String>();//容器的使用 <>中的类型可以改变，ArrList 是容器类；
    public void add(String s){
        //ArrayList的add方法
        notes.add(s);
    }
    //增加记事本中的字符串；
    public void add(String s,int location){
        notes.add(location,s);
    }
    //在字符串的某一位置插入；
    //@Override
    public int getSize() {
        return notes.size();
    }
    //容器大小范围；
    //@Override
    public String getNote(int index) {
        return notes.get(index);
    }
    //输出某一位置数据；
    public void deLate(int index) {
        notes.remove(index);
    }
    //删除某一位置上的数据；
    public String[] disPlay(){
        String [] a= new String[notes.size()];
        int i;
        for (i = 0;i < notes.size();i++)
                   a[i] = notes.get(i);
        return a;
    }
    //输出容器类的字符串，借助字符串数组；
    public static void main(String[] args){
        NoteBook notebook = new NoteBook();
        notebook.add("-----记事本-----");
        String[] a= notebook.disPlay();
        for (String s:a){
            System.out.println(s);
        }
    }

}
