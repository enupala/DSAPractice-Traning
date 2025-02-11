package catchITProblems;

import java.util.*;

public class KillProcess {
    public static void main(String[] args) {
        List<Integer> ppid = Arrays.asList(3,10,15);
        List<Integer> pid = Arrays.asList(2,2,5);
//        List<Integer>  ppid=Arrays.asList(1,2,3,4,5);
//          List<Integer> pid=Arrays.asList(3,7,3,2,1) ;
        int kill = 2;
        System.out.println(killProcess2(pid, ppid, kill));
    }

    private static List<Integer> killProcess2(List<Integer> pid, List<Integer> ppid, int kill) {
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<ppid.size();i++)
        {
            int parent=ppid.get(i);
            int child=pid.get(i);
            map.putIfAbsent(parent,new ArrayList<>());
            map.get(parent).add(child);
        }
        Queue<Integer>q=new ArrayDeque<>();
        ArrayList<Integer>list=new ArrayList<>();
        q.offer(kill);
        int size=q.size();
        for(int i=0;i<size;i++)
        {
            int rem=q.poll();
            list.add(rem);
            if(map.containsKey(rem))
                q.addAll(map.get(rem));
        }
        int parentIndex=pid.indexOf(kill);
        if(parentIndex!=-1)
        {
            int parent=ppid.get(parentIndex);
            if(parent!=0 && !list.contains(parent))
            {
                list.add(parent);
            }
        }
        return  list;
    }
    private static List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        HashMap<Integer,List<Integer>>killProcess=new HashMap<>();
        for(int i=0;i<ppid.size();i++) {
            int parent = ppid.get(i);
            int child=pid.get(i);
            killProcess.putIfAbsent(parent,new ArrayList<>());
            killProcess.get(parent).add(child);
        }
        Queue<Integer>q=new ArrayDeque<>();
        List<Integer>list=new ArrayList<>();
        q.add(kill);
        while(q.size()>0)
        {
            int rem=q.poll();
           list.add(rem);
           if(killProcess.containsKey(rem))
               q.addAll(killProcess.get(rem));
        }
        return list;

    }
    private static List<Integer> killProcess1(List<Integer> pid, List<Integer> ppid, int kill) {
        HashMap<Integer,List<Integer>>killProcess=new HashMap<>();
        for(int i=0;i<ppid.size();i++)
        {
            int parent=ppid.get(i);
            int child=pid.get(i);
            killProcess.putIfAbsent(parent,new ArrayList<>());
            killProcess.get(parent).add(child);
        }
        Queue<Integer>q=new ArrayDeque<>();
        List<Integer>list=new ArrayList<>();
        q.add(kill);
        while(q.size()>0)
        {
            int rem=q.poll();
            list.add(rem);
            if(killProcess.containsKey(rem))
            {
                q.addAll(killProcess.get(rem));
            }
        }
    return list;
    }
}
