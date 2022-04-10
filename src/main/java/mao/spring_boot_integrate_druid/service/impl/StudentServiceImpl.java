package mao.spring_boot_integrate_druid.service.impl;

import mao.spring_boot_integrate_druid.entity.Student;
import mao.spring_boot_integrate_druid.mapper.StudentMapper;
import mao.spring_boot_integrate_druid.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author mao
 * @since 2022-04-10
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService
{

}
