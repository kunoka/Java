package com.imooc.homework;

import java.io.Serializable;
import java.util.Objects;

public class Song implements Serializable {
  String id;
  String name;
  String singer;

  public Song(String id, String name, String singer) {
    this.id = id;
    this.name = name;
    this.singer = singer;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSinger() {
    return singer;
  }

  @Override
  public String toString() {
    return "歌曲编号:" + id + "  歌曲名称:" + name + "  演唱者:" + singer;
  }

  public void setSinger(String singer) {
    this.singer = singer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Song)) return false;
    Song song = (Song) o;
    return Objects.equals(id, song.id) &&
      Objects.equals(name, song.name) &&
      Objects.equals(singer, song.singer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, singer);
  }
}
