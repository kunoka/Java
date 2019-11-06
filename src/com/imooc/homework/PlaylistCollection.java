package com.imooc.homework;

import java.util.*;

public class PlaylistCollection {
  Map PlaylistMap;

  public PlaylistCollection(Map playlistMap) {
    PlaylistMap = playlistMap;
  }

  public Map getPlaylistMap() {
    return PlaylistMap;
  }

  public void setPlaylistMap(Map playlistMap) {
    PlaylistMap = playlistMap;
  }

  //添加播放列表
  public void addPlaylist(Playlist playlist) {
    String name = playlist.getPlaylistName();
    Playlist pl = searchPlaylistByName(name);
    if (pl == null) {
      ArrayList al = new ArrayList();
      Playlist pl_new = new Playlist(name, al);
      PlaylistMap.put(name, pl_new);
    }else{
      System.out.println("播放列表 " + name + " 已经存在");
    }
  }

  //删除播放列表
  public void deletePlaylist(Playlist playlist) {
    PlaylistMap.remove(playlist.getPlaylistName(), playlist.getMusicList());
    System.out.println("删除" + playlist.getPlaylistName() + "成功.");
  }

  //通过名字查询
  public Playlist searchPlaylistByName(String playlistName) {
    Map playlist = getPlaylistMap();
    Set<Map.Entry<String, Playlist>> entrySet = playlist.entrySet();
    for (Map.Entry<String, Playlist> entry : entrySet) {
      if (entry.getKey().equals(playlistName)) {
        Playlist pl = entry.getValue();
        System.out.println("该播放列表存在!");
        System.out.println("该播放列表的名称为: " + entry.getKey());
        System.out.println("该播放列表的歌曲为: " + (pl == null ? "" : entry.getValue()));
        return pl;
      }
    }
    return null;
  }

  //显示所有播放列表的名称
  public void displayPlaylistName() {
    Map playlist = getPlaylistMap();
    Set<String> keySet = playlist.keySet();
    for (String key : keySet) {
      System.out.println(key);
    }
  }
}
