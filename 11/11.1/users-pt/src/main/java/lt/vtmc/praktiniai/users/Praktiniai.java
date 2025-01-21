package lt.vtmc.praktiniai.users;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        int count = 0;
        for (User user : users) {
            if (user.getAge() > 25) {
                count++;
            }
        }
        return count;
    }

    public static double getAverageAge(List<User> users) {
        if (users == null || users.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (User user : users) {
            sum += user.getAge();
        }

        return sum / users.size();
    }


    // TODO: Naudokite klase Collections.min(). Paduokite Comparator
    public static Integer getMinAge(List<User> users) {
        User minAge = Collections.min(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        return minAge.getAge();
    }

    public static User findByName(List<User> users, String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }


    // TODO: Naudokite klase Collections.sort(). Paduokite Comparator
    public static List<User> sortByAge(List<User> users) {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                }
                return 0;
            }
        });
        return users;
    }

    // TODO: Naudokite klase Collections.max(). Paduokite Comparator
    public static User findOldest(List<User> users) {
        User maxAge = Collections.max(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return maxAge;
    }

    public static int sumAge(List<User> users) {
        int sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }
        return sum;
    }


}
