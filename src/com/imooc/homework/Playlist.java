package com.imooc.homework;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Playlist {
  private String playlistName;
  private List<Song> musicList;

  public Playlist(String playlistName, ArrayList<Song> musicList) {
    this.playlistName = playlistName;
    this.musicList = musicList;
  }

  public Playlist(String playlistName) {
    this.playlistName = playlistName;
  }

  public String getPlaylistName() {
    return playlistName;
  }

  public void setPlaylistName(String playlistName) {
    this.playlistName = playlistName;
  }

  public List<Song> getMusicList() {
    return musicList;
  }

  public void setMusicList(ArrayList<Song> musicList) {
    this.musicList = musicList;
  }

  // 将歌曲添加到播放列表
  public void addToPlaylist(Song song) {
    musicList.add(song);
    System.out.println("歌曲" + song + "添加成功");
  }

  //显示播放列表的所有歌曲
  public void DisplayAllSong() {
    List list = getMusicList();
    int size = list.size();
    if (size == 0) {
      System.out.println("当前播放列表" + getPlaylistName() + ": 没有歌曲。");
    }
    for (int i = 0; i < size; i++) {
      Song song = (Song) list.get(i);
      System.out.println(song);
    }
  }

  //通过歌曲id查询播放列表中的歌曲
  public Song searchSongById(String id) {
    List list = getMusicList();
    int size = list.size();
    for (int i = 0; i < size; i++) {
      Song song = (Song) list.get(i);
      if (song.id.equals(id)) {
        System.out.println("找到歌曲: " + song);
        return song;
      }
    }
    System.out.println("当前播放列表中没有歌曲" + id);
    return null;
  }

  //通过歌曲id查询播放列表中的歌曲
  public Song searchSongByName(String name) {
    List list = getMusicList();
    int size = list.size();
    for (int i = 0; i < size; i++) {
      Song song = (Song) list.get(i);
      if (song.name.equals(name)) {
        System.out.println("找到歌曲: " + song);
        return song;
      }
    }
    System.out.println("当前播放列表中没有歌曲" + name);
    return null;
  }

  //修改歌曲
  public void updateSong(Song song) {
    List list = getMusicList();
    int size = list.size();
    for (int i = 0; i < size; i++) {
      Song curSong = (Song) list.get(i);
      if (curSong.id.equals(song.id)) {
        list.remove(i);
        list.add(i, song);
        System.out.println(song + "插入成功");
      }
    }
  }

  // 从播放列表中删除歌曲
  public void deleteSong(String id) {
    List list = getMusicList();
    int size = list.size();
    for (int i = 0; i < size; i++) {
      Song song = (Song) list.get(i);
      if (song.id.equals(id)) {
        list.remove(i);
        System.out.println("删除成功");
      }
    }
  }

  //显示 播放列表中的所有歌曲
  public void displayAllSong() {
    List list = getMusicList();
    int size = list.size();
    for (int i = 0; i < size; i++) {
      Song song = (Song) list.get(i);
      System.out.println(song);
    }
  }

  //导出歌单
  public void exportPlaylist() {
    List list = getMusicList();
    int size = list.size();
    if (size == 0) {
      System.out.println("歌单" + getPlaylistName() + "没有歌曲，不需要导出。");
    } else {
      try {
        String fileName = "./src/com/imooc/homework/" + getPlaylistName() + ".txt";
        System.out.println("fileName" + fileName);
        File file = new File(fileName);
        if (!file.exists()) {
          file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (int i = 0; i < size; i++) {
          Song song = (Song) list.get(i);
          oos.writeObject(song);
        }
        System.out.println("歌单导出完成");
        //导出的歌曲为
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        for (int i = 0; i < size; i++) {
          System.out.println(ois.readObject());
        }
        fos.flush();
        fos.close();
        fis.close();
        oos.flush();
        oos.close();
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    }
  }

  //打印播放列表信息
  public String toString() {
    return "播放列表名称: " + getPlaylistName() + "   歌曲列表:" + getMusicList();
  }
}
