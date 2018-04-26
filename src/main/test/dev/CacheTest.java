package dev;
//
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Assert;
//import org.junit.Test;

//public class CacheTest extends BaseMapperTest {
public class CacheTest{
//	
//@Test
//public void testL1Cache() {
//	//获取 SqlSession
//	SqlSession sqlSession = getSqlSession() ;
//	SysUser userl = null ;
//	try {
//	//获取 UserMapper 接口
//	UserMapper userMapper = sqlSession.getMapper (UserMapper.class) ;
//	//调用 selectByid 方法，查询 id = 1 的用户
//	userl = userMapper.selectByid(ll);
//	//对当前获取的对象重新赋值
//	userl.setUserName ("New Name") ;
//	//再次查询获取 id 相同的用户
//	SysUser user2 = userMapper.selectByid(ll) ;
//	//虽然没有更新数据库，但是这个用户名和 userl 重新赋值的名字相同
//	Assert.assertEquals ("New Name", user2.getUserName()) ;
//	// 无论如何， user 2 和 userl 完全就是 同一个实例
//	Assert.assertEquals(userl , user2) ;
//	} finally {
//	//关 闭当前的 sqlSessio口
//	sqlSession.close() ;
//	System.out.println ( "开 启新的 sqlSession ");
//	//开始另一个新的 session
//	sqlSession = getSqlSession();
//	try {
//	//获取 UserMapper 接 口
//	UserMapper userMapper = sqlSession.getMapper (UserMapper.class) ;
//	//调 用 selectByid 方法，查询 id = 1 的用户
//	SysUser user2 = userMapper.selectByid(ll) ;
//	// ;第二个 session 获取的用户名仍然是 admin
//	Assert.assertNotEquals (" New Name", user2.getUserName()) ;
//	//这里的 us er2 和前一个 session 查询的结采是两个不同的实例
//	Assert.assertNotEquals(userl , user2) ;
//	//执行7i11J 除操作
//	userMapper.deleteByid (2L);
//	//获取 user3
//	SysUser user3 = userMapper.selectByid(ll) ;
//	//这里的 user2 和 user3 是两个不同的实例
//	Assert.assertNotEquals(user2 , user3);
//	} finally {
//	//关闭 sqlSession
//	sqlSession.close ();
//	}
//	}
}