package com.imooc.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class testPlaylistCollection {
  public static void main(String[] args) {
    ArrayList list1 = new ArrayList();
    list1.add("小天鹅");
    list1.add("最美");
    Playlist pl1 = new Playlist("普通播放列表", list1);
    HashMap<String, Playlist> hm1 = new HashMap<>();
    hm1.put(pl1.getPlaylistName(),  pl1);
    PlaylistCollection pc = new PlaylistCollection(hm1);
    pc.displayPlaylistName();
    list1.add("春天");
    Playlist pl2 = new Playlist("最爱", list1);
    hm1.put(pl2.getPlaylistName(), pl2);
    pc.addPlaylist(pl2);
    pc.displayPlaylistName();
    System.out.println("****删除播放列表****");
    pc.deletePlaylist(pl2);
    pc.displayPlaylistName();
    //搜索播放列表
    System.out.println("****搜索播放列表 普通播放列表****");
    System.out.println(pc.searchPlaylistByName("普通播放列表"));
    pc.displayPlaylistName();
  }
}
