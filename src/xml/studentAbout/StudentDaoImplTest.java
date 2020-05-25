package xml.studentAbout;



class StudentDaoImplTest {
    public static void main(String[] args) throws Exception {
        //创建一个学生对象
        Student student = new Student("002","李白",18);
        //创建一个dao对象
        StudentDaoImpl dao = new StudentDaoImpl();
        dao.addStu(student);
        dao.removeStu("002");
    }

}