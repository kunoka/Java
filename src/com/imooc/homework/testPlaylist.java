package com.imooc.homework;

import java.util.ArrayList;
import java.util.List;

public class testPlaylist {
  public static void main(String[] args) {
    List list = new ArrayList<String>();
    Playlist pl = new Playlist("我的最爱",(ArrayList)list);
    System.out.println("1:" + pl.getMusicList());
    Song song = new Song("s0001", "天气预报", "张三");
    list.add(song);
    System.out.println("2:" + pl.getMusicList());
    Song song2 = new Song("s0002", "我爱你中国", "彩虹合唱团");
    list.add(song2);
    System.out.println(pl.getPlaylistName());
    System.out.println("3:" + pl.getMusicList());
    System.out.println(pl.getMusicList());
    System.out.println(list.size());
    System.out.println("-----开始打印所有歌曲------");
    pl.displayAllSong();

    System.out.println("-----查找歌曲 id s0002------");
    Song targetSong = pl.searchSongById("s0002");
    System.out.println(targetSong);
    System.out.println("-----查找歌曲名字 我爱你中国------");
    targetSong = pl.searchSongByName("我爱你中国");
    System.out.println(targetSong);
    System.out.println("-----删除歌曲 id s0002------");
    pl.deleteSong("s0002");
    System.out.println("-----开始打印所有歌曲------");
    pl.displayAllSong();
    System.out.println("-----更新歌曲 s001------");
    Song newSong = new Song("s0001","一生何求","李克勤");
    pl.updateSong(newSong);
    System.out.println("-----开始打印所有歌曲------");
    pl.displayAllSong();
//    System.out.println("-----导出所有歌曲------");
//    pl.exportPlaylist();
  }
}
