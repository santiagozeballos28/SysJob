
package com.company.session;

import com.company.tools.ConstantData;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author santiago.mamani
 */
public class Connection {

    public SqlSession getSqlSession() throws IOException {
        String fileConfiguration = ConstantData.FILE_CONFIGURATION;
        SqlSession sqlSession = null;
        Reader reader = Resources.getResourceAsReader(fileConfiguration);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        sqlSession = sessionFactory.openSession();
        return sqlSession;
    }
}
