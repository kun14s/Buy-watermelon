class Matter {
    public String name;
    public boolean destroyed;
    public Matter() {
        name = "Nope";
        destroyed = true;
    }
    public Matter(String arg1) {
        name = arg1;
        destroyed = false;
    }
}
class Person {
    public Matter vehicle;
    public String name;
    public String work;
    public String emotion;
    public boolean active;
    public Matter picks;
    public Person() {
        vehicle = new Matter();
        name = "Nope";
        work = "Nope";
        emotion = "Nope";
        active = false;
        picks = new Matter();
    }
    public Person(Matter arg1, String arg2, String arg3, String arg4, boolean arg5, Matter arg6) {
        vehicle = arg1;
        name = arg2;
        work = arg3;
        emotion = arg4;
        active = arg5;
        picks = arg6;
    }
    public void say(String arg) {
        if (!active) {
            System.err.print(name);
            System.err.println("已死。");
        } else {
            System.out.print(name);
            System.out.print("：");
            System.out.println(arg);
        }
    }
    public void shout(String arg) {
        if (!active) {
            System.err.print(name);
            System.err.println("已死。");
        } else {
            System.out.print(name);
            System.out.print("：");
            System.out.print(arg);
            System.out.println("！！！");
        }
    }
    public void destroy(Matter arg) {
        if (!active) {
            System.err.print(name);
            System.err.println("已死。");
        } else {
            System.out.print("（");
            System.out.print(name);
            System.out.print("用");
            System.out.print(picks.name);
            if (picks.name.equals("刀")) {
                System.out.print("劈了");
                System.out.print(arg.name);
                System.out.println("）");
            } else {
                System.out.print("破坏了");
                System.out.print(arg.name);
                System.out.print("）");
            }
            arg.destroyed = true;
        }
    }
    public void pick_up(Matter arg) {
        if (!active) {
            System.err.print(name);
            System.err.println("已死。");
        } else {
            picks = arg;
        }
    }
    public void kill(Person other) {
        if (!active) {
            System.err.print(name);
            System.err.println("已死。");
        } else {
            System.out.print("（");
            System.out.print(name);
            System.out.print("用");
            System.out.print(picks);
            System.out.print("把");
            System.out.print(other.name);
            if (picks.name.equals("刀")) {
                System.out.println("捅了）");
            } else {
                System.out.println("杀了）");
            }
            other.active = false;
        }
    }
    public void run() {
        if (!active) {
            System.err.print(name);
            System.err.println("已死。");
        } else {
            System.out.print("（");
            System.out.print(name);
            System.out.print("骑");
            System.out.print(vehicle.name);
            System.out.println("走了）");
        }
    }
    public void smoke() {
        if (!active) {
            System.err.print(name);
            System.err.println("已死。");
        } else {
            System.out.print("（");
            System.out.print(name);
            System.out.print("抽烟");
            System.out.println("）");
        }
    }
}
public class Buy_watermelon {
    public static void main(String[] args) {
        Matter watermelon = new Matter("西瓜");
        Matter magnet = new Matter("吸铁石");
        Matter knife = new Matter("刀");
        Matter scale = new Matter("秤");
        Matter stool = new Matter("凳子");
        Matter motorbike = new Matter("摩托");
        Matter empty = new Matter();
        Person Liu_Huaqiang = new Person(motorbike, "刘华强", "Nope", "平静", true, empty);
        Person Hao_Ge = new Person(empty, "郝哥", "瓜摊老板", "平静", true, empty);
        Person XiaoDi1 = new Person(empty, "小弟1", "瓜摊小弟一个", "平静", true, empty);
        Person XiaoDi2 = new Person(empty, "小弟2", "瓜摊小弟一个", "平静", true, empty);
        Person man = new Person(empty, "路人", "剧情没讲", "平静", true, empty);
        System.out.println("（有一个人前来买瓜。）");
        Liu_Huaqiang.vehicle = empty;
        Liu_Huaqiang.say("哥们儿，你这瓜多少钱一斤呐？");
        Hao_Ge.say("两块钱一斤。");
        Liu_Huaqiang.say("What's up.");
        Liu_Huaqiang.say("你这瓜皮子是金子做的还是瓜粒子是金子做的？");
        Hao_Ge.smoke();
        Hao_Ge.say("你瞧瞧现在哪有瓜啊，这都是大棚的瓜，你嫌贵我还嫌贵呢。");
        Liu_Huaqiang.say("给我挑一个。");
        Hao_Ge.say("彳亍。");
        Hao_Ge.pick_up(watermelon);
        System.out.println("（郝哥拍瓜）");
        Hao_Ge.say("这个怎么样？");
        Liu_Huaqiang.say("这瓜保熟吗？");
        System.out.println("（郝哥转头。）");
        Hao_Ge.say("我开水果摊的，能卖给你生瓜蛋子？");
        Liu_Huaqiang.say("我问你这瓜——保——熟——吗？");
        System.out.println("（郝哥抬头。）");
        Hao_Ge.emotion = "愤怒";
        Hao_Ge.say("你是故意找茬是不是？你要不要吧？");
        Liu_Huaqiang.emotion = "嬉皮笑脸";
        Liu_Huaqiang.say("你这瓜要是熟我肯定要啊。");
        Liu_Huaqiang.vehicle = stool;
        Liu_Huaqiang.emotion = "平静";
        System.out.println("（华强坐下。）");
        Liu_Huaqiang.say("那它要是不熟怎么办呢？");
        Hao_Ge.say("要是不熟，我自己吃了它，满意了吧？");
        Hao_Ge.picks = empty;
        System.out.println("（郝哥称瓜。）");
        Hao_Ge.say("15斤，30块。");
        Liu_Huaqiang.say("你这哪够15斤啊，你这秤有问题吧。");
        Hao_Ge.say("你他妈是故意找茬是不是？你要不要吧？！");
        System.out.println("（华强翻开秤。）");
        Liu_Huaqiang.pick_up(scale);
        Liu_Huaqiang.pick_up(magnet);
        Liu_Huaqiang.picks = empty;
        Liu_Huaqiang.say("吸铁石。另外你说的，这瓜要不熟你自己吞进去啊！");
        Liu_Huaqiang.vehicle = empty;
        Liu_Huaqiang.pick_up(knife);
        Liu_Huaqiang.destroy(watermelon);
        Hao_Ge.say("你他妈劈我瓜是吧！我……！（被捅了。）");
        Hao_Ge.emotion = "痛苦";
        Liu_Huaqiang.kill(Hao_Ge);
        XiaoDi1.emotion = "惊慌";
        XiaoDi2.emotion = "惊慌";
        XiaoDi1.shout("郝哥！郝哥");
        XiaoDi2.shout("撒日朗");
        // Hao_Ge.shout("凭什么我要死"); // 没办法，你已经死了
        Liu_Huaqiang.picks = empty;
        Liu_Huaqiang.vehicle = motorbike;
        Liu_Huaqiang.run();
        man.say("华强！欸，华强！");
        System.out.println("（END - 幕落。）");
    }
}