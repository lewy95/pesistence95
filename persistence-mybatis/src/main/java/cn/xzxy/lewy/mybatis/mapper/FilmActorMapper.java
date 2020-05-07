package cn.xzxy.lewy.mybatis.mapper;

import cn.xzxy.lewy.mybatis.pojo.FilmActor;
import cn.xzxy.lewy.mybatis.pojo.FilmActorExample;
import cn.xzxy.lewy.mybatis.pojo.FilmActorKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FilmActorMapper {
    long countByExample(FilmActorExample example);

    int deleteByExample(FilmActorExample example);

    int deleteByPrimaryKey(FilmActorKey key);

    int insert(FilmActor record);

    int insertSelective(FilmActor record);

    List<FilmActor> selectByExample(FilmActorExample example);

    FilmActor selectByPrimaryKey(FilmActorKey key);

    int updateByExampleSelective(@Param("record") FilmActor record, @Param("example") FilmActorExample example);

    int updateByExample(@Param("record") FilmActor record, @Param("example") FilmActorExample example);

    int updateByPrimaryKeySelective(FilmActor record);

    int updateByPrimaryKey(FilmActor record);
}