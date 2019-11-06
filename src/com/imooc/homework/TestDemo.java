package com.imooc.homework;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestDemo {
  public static void main(String[] args) {
    //创建主播放列表
    ArrayList al = new ArrayList();
    Playlist mal = new Playlist("主播放列表", al);
    HashMap<String, Object> mainPlaylist = new HashMap<String, Object>();
    mainPlaylist.put("主播放列表", mal);
    PlaylistCollection pc = new PlaylistCollection(mainPlaylist);
    test(pc);
  }

  private static void test(PlaylistCollection pc) {
    printMainMenu(pc);
  }

  // 打印主菜单
  private static void printMainMenu(PlaylistCollection pc) {
    System.out.println("*****************************************");
    System.out.println("             **主菜单**");
    System.out.println("             1--播放列表管理");
    System.out.println("             2--播放器管理");
    System.out.println("             0--退出");
    System.out.println("*****************************************");
    System.out.println("请输入对应数字进行操作:");
    Scanner sc = new Scanner(System.in);
    try {
      int i = sc.nextInt();
      if (i != 0) {
        if (i == 1) { // 1.进入播放列表管理菜单
          printPlaylistMenu(pc);
        } else if (i == 2) {  // 2.进入播放器管理菜单
          printPlayerMenu(pc);
        } else {
          System.out.println("输入错误，请重新输入");
          printMainMenu(pc);
        }
      }
    } catch (java.util.InputMismatchException e) {
      System.out.println("数据类型错误，请输入数值型数据！");
      printMainMenu(pc);
    }
  }

  // 打印播放列表菜单
  private static void printPlaylistMenu(PlaylistCollection pc) {
    System.out.println("*****************************************");
    System.out.println("             **播放列表管理**");
    System.out.println("             1--将歌曲添加到主播放列表");
    System.out.println("             2--将歌曲添加到普通播放列表");
    System.out.println("             3--通过歌曲id查询播放列表中的歌曲");
    System.out.println("             4--通过歌曲名称查询播放列表中的歌曲");
    System.out.println("             5--修改播放列表中的歌曲");
    System.out.println("             6--删除播放列表中的歌曲");
    System.out.println("             7--显示播放列表中的所有歌曲");
    System.out.println("             8--导出歌单");
    System.out.println("             9--返回上一级菜单");
    System.out.println("*****************************************");
    System.out.println("请输入对应数字进行操作:");
    Scanner sc = new Scanner(System.in);
    try {
      int m = sc.nextInt();
      switch (m) {
        case 1:
          System.out.println("1--将歌曲添加到主播放列表");
          System.out.println("请输入歌曲数量");
          Integer n = sc.nextInt();
          Integer i = 1;
          while (i < n + 1) {
            System.out.println("请输入第" + i++ + "首歌的信息");
            System.out.println("请输入歌曲id:");
            String id = sc.next();
            System.out.println("请输入歌曲名称:");
            String name = sc.next();
            System.out.println("请输入歌曲演唱者:");
            String singer = sc.next();
            Song newSong = new Song(id, name, singer);
            Playlist mpl = pc.searchPlaylistByName("主播放列表");
            mpl.addToPlaylist(newSong);
            System.out.println("主播放列表当前歌曲:");
            mpl.displayAllSong();
          }
          printPlaylistMenu(pc);
          break;
        case 2:
          System.out.println("请输入普通播放列表名称");
          String pln = sc.next();
          Playlist npl = pc.searchPlaylistByName(pln);
          if (npl == null) {
            System.out.println("播放列表名称不存在,请先创建播放列表");
            printPlaylistMenu(pc);
          } else {
            System.out.println("请输入歌曲数量");
            n = sc.nextInt();
            i = 1;
            while (i < n + 1) {
              System.out.println("正在输入第" + i++ + "首歌曲");
              System.out.println("请输入歌曲编号:");
              String id = sc.next();
              System.out.println("请输入歌曲名称:");
              String name = sc.next();
              System.out.println("请输入歌曲演唱者:");
              String singer = sc.next();
              Song song = new Song(id, name, singer);
              npl.addToPlaylist(song);
            }
            printPlaylistMenu(pc);
          }
        case 3:
          System.out.println("请输入播放列表名称:");
          String name = sc.next();
          Playlist pl = pc.searchPlaylistByName(name);
          System.out.println("请输入歌曲编号:");
          String id = sc.next();
          try {
            pl.searchSongById(id);
            printPlaylistMenu(pc);
          } catch (java.lang.NullPointerException e) {
            System.out.println("没有找到歌曲" + id);
            printPlaylistMenu(pc);
          }
        case 4:
          System.out.println("请输入播放列表名称:");
          name = sc.next();
          pl = pc.searchPlaylistByName(name);
          System.out.println("请输入歌曲名称:");
          name = sc.next();
          pl.searchSongByName(name);
          printPlaylistMenu(pc);
        case 5:
          System.out.println("请输入播放列表名称:");
          name = sc.next();
          pl = pc.searchPlaylistByName(name);
          System.out.println("请输入歌曲编号:");
          id = sc.next();
          System.out.println("请输入歌曲名称:");
          name = sc.next();
          System.out.println("请输入歌曲演唱者:");
          String singer = sc.next();
          Song song = new Song(id, name, singer);
          pl.updateSong(song);
          printPlaylistMenu(pc);
        case 6:
          System.out.println("请输入要删除歌曲的播放列表名称:");
          name = sc.next();
          pl = pc.searchPlaylistByName(name);
          System.out.println("请输入要删除的歌曲编号:");
          id = sc.next();
          try {
            pl.deleteSong(id);
            printPlaylistMenu(pc);
          } catch (java.lang.NullPointerException e) {
            printPlaylistMenu(pc);

          }
        case 7:
          System.out.println("请输入播放列名称:");
          name = sc.next();
          pl = pc.searchPlaylistByName(name);
          pl.displayAllSong();
          printPlaylistMenu(pc);
        case 8:
          System.out.println("请输入要导出的播放列名称:");
          name = sc.next();
          pl = pc.searchPlaylistByName(name);
          try {
            pl.exportPlaylist();
          } catch (java.lang.NullPointerException e) {
            System.out.println("歌单为空");
          }
          printPlaylistMenu(pc);
        case 9:
          System.out.println("9--返回上一级菜单");
          printMainMenu(pc);
          break;
        default:
          System.out.println("输入错误，请重新输入");
          printPlaylistMenu(pc);
          break;
      }
    } catch (java.util.InputMismatchException e) {
      System.out.println("数据类型错误，请输入数值型数据!!");
      printPlaylistMenu(pc);
    }
  }

  // 打印播放器菜单
  private static void printPlayerMenu(PlaylistCollection pc) {
    System.out.println("*****************************************");
    System.out.println("             **播放器管理**");
    System.out.println("             1--向播放器添加播放列表");
    System.out.println("             2--从播放器删除播放列表");
    System.out.println("             3--通过名字查询播放列表信息");
    System.out.println("             4--显示所有播放列表名称");
    System.out.println("             9--返回上一级菜单");
    System.out.println("*****************************************");
    System.out.println("请输入对应数字进行操作:");
    Scanner sc = new Scanner(System.in);
    try {
      int n = sc.nextInt();
      switch (n) {
        case 1:
          System.out.println("1--向播放器添加播放列表");
          System.out.println("请输入播放列表名称:");
          String name = sc.next();
          Playlist pl = new Playlist(name);
          pc.addPlaylist(pl);
          printPlayerMenu(pc);
          break;
        case 2:
          System.out.println("请输入要删除的播放列表名称");
          name = sc.next();
          Playlist pl1 = pc.searchPlaylistByName(name);
          pc.deletePlaylist(pl1);
          printPlayerMenu(pc);
          break;
        case 3:
          System.out.println("请输入播放列表名称:");
          name = sc.next();
          pc.searchPlaylistByName(name);
          printPlayerMenu(pc);
          break;
        case 4:
          pc.displayPlaylistName();
          printPlayerMenu(pc);
          break;
        case 9:
          System.out.println("9--返回上一级菜单");
          printMainMenu(pc);
          break;
        default:
          System.out.println("数据类型错误，请输入数值型数据!!!");
          break;
      }


    } catch (java.util.InputMismatchException e) {
      System.out.println("数据类型错误，请输入数值型数据！");
      printPlaylistMenu(pc);
    }
  }
}
