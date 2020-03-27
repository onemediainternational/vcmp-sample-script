package com.github.newk5.vcmp.samplescript.controllers;

import com.github.newk5.vcmp.samplescript.commands.AdminCommands;
import com.github.newk5.vcmp.samplescript.commands.PlayerCommands;
import com.maxorator.vcmp.java.plugin.integration.RootEventHandler;
import com.maxorator.vcmp.java.plugin.integration.generic.Vector;
import com.maxorator.vcmp.java.plugin.integration.placeable.CheckPoint;
import com.maxorator.vcmp.java.plugin.integration.placeable.GameObject;
import com.maxorator.vcmp.java.plugin.integration.placeable.Pickup;
import com.maxorator.vcmp.java.plugin.integration.player.Player;
import com.maxorator.vcmp.java.plugin.integration.server.Server;
import com.maxorator.vcmp.java.plugin.integration.vehicle.Vehicle;
import com.maxorator.vcmp.java.plugin.integration.vehicle.VehicleColours;
import com.maxorator.vcmp.java.tools.commands.CommandRegistry;
import com.maxorator.vcmp.java.tools.timers.TimerRegistry;

public class MainController extends RootEventHandler {

    public static final int COLOUR_YELLOWISH = 0xFFFF5500;

    private ClientDataController onClientData;
    protected CommandRegistry commandRegistry;
    protected TimerRegistry timerRegistry;
    public static Server server;

    public MainController(Server server) {
        super(server);
        this.server = server;
        this.timerRegistry = new TimerRegistry();
        this.onClientData = new ClientDataController();
        this.commandRegistry = new CommandRegistry(server);

        this.commandRegistry.addController(new PlayerCommands());
        this.commandRegistry.addController(new AdminCommands());

    }

    @Override
    public void onServerLoadScripts() {
        server.setSpawnScreenPlayerPos(-1515.6725f, -978.0356f, 23.3579f);
        server.setSpawnScreenCameraPos(-1515.2781f, -971.8694f, 23.3579f);
        server.setSpawnScreenCameraLookAt(-1517.0947f, -1005.3253f, 23.3579f);
        server.setWorldBounds(5000.0f,-5000.0f,5000.0f,-5000.0f);
        
        server.addPlayerClass(255,0xffffff,0,-330.2545f,-556.9352f,12.8079f,7.5261f,25,999,21,250,32,500);
        server.addPlayerClass(255,0xffffff,95,-330.2545f,-556.9352f,12.8079f,7.5261f,25,999,21,250,32,500);
        server.addPlayerClass(255,0xffffff,96,-330.2545f,-556.9352f,12.8079f,7.5261f,25,999,21,250,32,500);
        server.addPlayerClass(5,0xdc143b,4,-1721.9758f,-238.0983f,14.8683f,182.1496f,25,999,21,250,32,500);
        server.addPlayerClass(5,0xdc143b,2,-1721.9758f,-238.0983f,14.8683f,182.1496f,25,999,21,250,32,500);
        server.addPlayerClass(9,0xee82ef,106,100.3145f,-1477.8365f,10.4318f,219.4836f,25,999,21,250,32,500);
        server.addPlayerClass(9,0xee82ef,54,100.3145f,-1477.8365f,10.4318f,219.4836f,25,999,21,250,32,500);
        server.addPlayerClass(9,0xee82ef,105,100.3145f,-1477.8365f,10.4318f,219.4836f,25,999,21,250,32,500);
        server.addPlayerClass(13,0x14ff7f,56,-534.7047f,781.4671f,97.5104f,188.3568f,25,999,21,250,32,500);
        server.addPlayerClass(13,0x14ff7f,68,-534.7047f,781.4671f,97.5104f,188.3568f,25,999 ,21,250,32,500);
        server.addPlayerClass(13,0x14ff7f,21,-534.7047f,781.4671f,97.5104f,188.3568f,25,999,21,250,32,500);
        server.addPlayerClass(4,0xffd720,74,-1007.1512f,198.3759f,11.3460f,85.7704f,25,999,21,250,32,500);
        server.addPlayerClass(4,0xffd720,14,-1007.1512f,198.3759f,11.3460f,85.7704f,25,999,21,250,32,500);
        server.addPlayerClass(4,0xffd720,57,-1007.1512f,198.3759f,11.3460f,85.7704f,25,999,21,250,32,500);
        server.addPlayerClass(2,0xa349a4,91,-602.2600f,631.6458f,12.2347f,280.0499f,25,999,21,250,32,500);
        server.addPlayerClass(2,0xa349a4,93,-602.2600f,631.6458f,12.2347f,280.0499f,25,999,21,250,32,500);
        server.addPlayerClass(2,0xa349a4,94,-602.2600f,631.6458f,12.2347f,280.0499f,25,999,21,250,32,500);
        server.addPlayerClass(0,0x778898,6,-689.0347f,760.3649f,11.0767f,186.1276f,25,999,21,250,32,500);
        server.addPlayerClass(0,0x778898,5,-689.0347f,760.3649f,11.0767f,186.1276f,25,999,21,250,32,500);
        server.addPlayerClass(0,0x778898,1,-689.0347f,760.3649f,11.0767f,186.1276f,25,999,21,250,32,500);
        server.addPlayerClass(6,0x638bec,98,468.2072f,-1720.5450f,11.6664f,81.3630f,25,999,21,250,32,500);
        server.addPlayerClass(6,0x638bec,99,468.2072f,-1720.5450f,11.6664f,81.3630f,25,999,21,250,32,500);
        server.addPlayerClass(6,0x638bec,100,468.2072f,-1720.5450f,11.6664f,81.3630f,25,999,21,250,32,500);
        
        server.createVehicle(198,0, new Vector(260.2516f,-249.8422f,10.9124f), (float) (355.4369 * 0.0174533), new VehicleColours(1,0));
        server.createVehicle(159,0, new Vector(233.3057f,-222.9456f,11.6132f), (float) (244.1794 * 0.0174533), new VehicleColours(2,0));
        server.createVehicle(141,0, new Vector(217.9356f,-350.0276f,10.5002f), (float) (73.0607 * 0.0174533), new VehicleColours(3,0));
        server.createVehicle(198,0, new Vector(132.7695f,-360.2486f,9.6139f), (float) (177.0713 * 0.0174533), new VehicleColours(4,0));
        server.createVehicle(205,0, new Vector(109.5626f,-373.5840f,8.5543f), (float) (182.9249 * 0.0174533), new VehicleColours(5,0));
        server.createVehicle(173,0, new Vector(201.1931f,-495.3416f,12.1244f), (float) (31.4877 * 0.0174533), new VehicleColours(6,0));
        server.createVehicle(156,0, new Vector(353.3358f,-509.3914f,12.0988f), (float) (139.7653 * 0.0174533), new VehicleColours(46,1));
        server.createVehicle(156,0, new Vector(369.6238f,-523.6013f,12.0989f), (float) (141.7164 * 0.0174533), new VehicleColours(46,1));
        server.createVehicle(156,0, new Vector(419.9079f,-432.8541f,9.8925f), (float) (51.5417 * 0.0174533), new VehicleColours(46,1));
        server.createVehicle(191,0, new Vector(506.4488f,-309.1463f,13.3565f), (float) (172.8387 * 0.0174533), new VehicleColours(10,0));
        server.createVehicle(198,0, new Vector(453.8818f,10.3348f,10.6491f), (float) (268.8188 * 0.0174533), new VehicleColours(11,0));
        server.createVehicle(159,0, new Vector(453.5932f,4.5801f,10.7696f), (float) (270.6931 * 0.0174533), new VehicleColours(12,0));
        server.createVehicle(210,0, new Vector(479.8828f,-40.0598f,9.9408f), (float) (278.0668 * 0.0174533), new VehicleColours(13,0));
        server.createVehicle(141,0, new Vector(500.0468f,-94.1788f,10.0640f), (float) (98.4667 * 0.0174533), new VehicleColours(1,0));
        server.createVehicle(178,0, new Vector(497.0737f,-86.6851f,9.5890f), (float) (316.7682 * 0.0174533), new VehicleColours(15,0));
        server.createVehicle(159,0, new Vector(529.6331f,-94.2399f,10.2383f), (float) (104.4042 * 0.0174533), new VehicleColours(16,0));
        server.createVehicle(169,0, new Vector(486.7632f,-571.3718f,10.6817f), (float) (155.4213 * 0.0174533), new VehicleColours(17,0));
        server.createVehicle(141,0, new Vector(244.4236f,-1269.9749f,10.6016f), (float) (168.4929 * 0.0174533), new VehicleColours(18,0));
        server.createVehicle(225,0, new Vector(301.1073f,-1004.1747f,11.4101f), (float) (351.7916 * 0.0174533), new VehicleColours(19,0));
        server.createVehicle(198,0, new Vector(161.4201f,-1512.4922f,10.6543f), (float) (157.2738 * 0.0174533), new VehicleColours(20,0));
        server.createVehicle(207,0, new Vector(206.8876f,-1614.6656f,10.5517f), (float) (43.4021 * 0.0174533), new VehicleColours(21,0));
        server.createVehicle(177,0, new Vector(432.3198f,-1700.4852f,9.0726f), (float) (88.8793 * 0.0174533), new VehicleColours(1,1));
        server.createVehicle(199,0, new Vector(-70.6939f,-1610.3605f,12.1978f), (float) (353.4938 * 0.0174533), new VehicleColours(1,1));
        server.createVehicle(154,0, new Vector(-109.7605f,-1491.6503f,10.3958f), (float) (107.8228 * 0.0174533), new VehicleColours(24,0));
        server.createVehicle(145,0, new Vector(-228.9418f,-1400.7190f,7.8863f), (float) (107.5473 * 0.0174533), new VehicleColours(25,0));
        server.createVehicle(206,0, new Vector(-155.0698f,-1220.1456f,10.2564f), (float) (271.9592 * 0.0174533), new VehicleColours(26,0));
        server.createVehicle(146,0, new Vector(-114.2717f,-944.0224f,10.6752f), (float) (282.6458 * 0.0174533), new VehicleColours(1,3));
        server.createVehicle(191,0, new Vector(-56.7146f,-1011.7702f,9.9863f), (float) (272.4575 * 0.0174533), new VehicleColours(28,0));
        server.createVehicle(210,0, new Vector(-38.2429f,-1013.8495f,10.2283f), (float) (3.0281 * 0.0174533), new VehicleColours(29,0));
        server.createVehicle(132,0, new Vector(-54.8456f,-998.0799f,10.2438f), (float) (270.1311 * 0.0174533), new VehicleColours(30,0));
        server.createVehicle(191,0, new Vector(96.3035f,-1479.6655f,9.8048f), (float) (79.9533 * 0.0174533), new VehicleColours(31,0));
        server.createVehicle(191,0, new Vector(96.7430f,-1475.7974f,9.9545f), (float) (198.6067 * 0.0174533), new VehicleColours(32,0));
        server.createVehicle(191,0, new Vector(100.8007f,-1473.4741f,9.9540f), (float) (215.4585 * 0.0174533), new VehicleColours(33,0));
        server.createVehicle(206,0, new Vector(51.9200f,-1065.1110f,10.2270f), (float) (27.8345 * 0.0174533), new VehicleColours(34,0));
        server.createVehicle(174,0, new Vector(48.6413f,-951.9876f,24.4023f), (float) (93.5679 * 0.0174533), new VehicleColours(35,0));
        server.createVehicle(178,0, new Vector(49.7133f,-935.9374f,14.8172f), (float) (180.1810 * 0.0174533), new VehicleColours(36,0));
        server.createVehicle(167,0, new Vector(-2.7163f,-1211.0195f,10.5566f), (float) (356.5548 * 0.0174533), new VehicleColours(37,0));
        server.createVehicle(207,0, new Vector(126.5108f,-1159.8766f,17.4722f), (float) (269.6177 * 0.0174533), new VehicleColours(38,0));
        server.createVehicle(174,0, new Vector(521.7869f,198.9516f,14.3228f), (float) (2.2884 * 0.0174533), new VehicleColours(39,0));
        server.createVehicle(210,0, new Vector(445.0040f,637.7461f,11.0134f), (float) (186.0508 * 0.0174533), new VehicleColours(40,0));
        server.createVehicle(146,0, new Vector(467.0002f,703.2138f,11.6150f), (float) (85.8190 * 0.0174533), new VehicleColours(1,3));
        server.createVehicle(154,0, new Vector(530.1797f,1261.2712f,15.9535f), (float) (123.0881 * 0.0174533), new VehicleColours(42,0));
        server.createVehicle(174,0, new Vector(308.8713f,1198.8339f,27.4195f), (float) (332.0109 * 0.0174533), new VehicleColours(43,0));
        server.createVehicle(156,0, new Vector(493.3178f,503.8737f,11.2679f), (float) (178.8689 * 0.0174533), new VehicleColours(46,1));
        server.createVehicle(157,0, new Vector(488.865f,517.761f,11.2679f), (float) (85.8190 * 0.0174533), new VehicleColours(46,1));
        server.createVehicle(178,0, new Vector(412.5331f,99.2144f,10.9599f), (float) (122.2297 * 0.0174533), new VehicleColours(2,0));
        server.createVehicle(154,0, new Vector(76.9115f,-879.2585f,10.3817f), (float) (7.0149 * 0.0174533), new VehicleColours(3,0));
        server.createVehicle(174,0, new Vector(-347.5807f,-525.7791f,12.6165f), (float) (267.1198 * 0.0174533), new VehicleColours(4,0));
        server.createVehicle(225,0, new Vector(-363.5435f,-528.9356f,13.2710f), (float) (1.3800 * 0.0174533), new VehicleColours(5,0));
        server.createVehicle(139,0, new Vector(-389.5653f,-513.9720f,12.6717f), (float) (269.0350 * 0.0174533), new VehicleColours(1,0));
        server.createVehicle(141,0, new Vector(-395.3849f,-528.3948f,12.5134f), (float) (2.9120 * 0.0174533), new VehicleColours(3,0));
        server.createVehicle(159,0, new Vector(-380.1669f,-474.9770f,10.8690f), (float) (270.0346 * 0.0174533), new VehicleColours(8,0));
        server.createVehicle(150,0, new Vector(-369.3293f,-344.4931f,10.8341f), (float) (87.0199 * 0.0174533), new VehicleColours(9,0));
        server.createVehicle(141,0, new Vector(-222.4900f,-422.5963f,10.9807f), (float) (76.8220 * 0.0174533), new VehicleColours(10,0));
        server.createVehicle(132,0, new Vector(-651.7634f,-510.8838f,10.1603f), (float) (266.9729 * 0.0174533), new VehicleColours(11,0));
        server.createVehicle(153,0, new Vector(-870.8638f,-572.4650f,11.1381f), (float) (276.1740 * 0.0174533), new VehicleColours(12,0));
        server.createVehicle(156,0, new Vector(-892.3503f,-700.5538f,10.9582f), (float) (219.7980 * 0.0174533), new VehicleColours(46,1));
        server.createVehicle(157,0, new Vector(-892.3503f,-717.7538f,10.9582f), (float) (219.7980 * 0.0174533), new VehicleColours(46,1));
        server.createVehicle(236,0, new Vector(-844.5757f,-671.4493f,10.9431f), (float) (94.5014 * 0.0174533), new VehicleColours(1,1));
        server.createVehicle(236,0, new Vector(-844.1319f,-675.3976f,10.9405f), (float) (94.9001 * 0.0174533), new VehicleColours(3,3));
        server.createVehicle(191,0, new Vector(-684.9528f,-1296.0425f,10.5953f), (float) (104.2648 * 0.0174533), new VehicleColours(19,0));
        server.createVehicle(225,0, new Vector(-680.4217f,-1306.4053f,11.5791f), (float) (114.3876 * 0.0174533), new VehicleColours(20,0));
        server.createVehicle(154,0, new Vector(-716.4633f,-1465.4225f,10.9831f), (float) (1.6378 * 0.0174533), new VehicleColours(21,0));
        server.createVehicle(169,0, new Vector(-724.9143f,-1466.0306f,10.9283f), (float) (330.3130 * 0.0174533), new VehicleColours(22,0));
        server.createVehicle(191,0, new Vector(-694.5987f,-1523.5654f,12.1738f), (float) (77.2146 * 0.0174533), new VehicleColours(23,0));
        server.createVehicle(217,0, new Vector(-691.7596f,-1568.7378f,12.5389f), (float) (57.9339 * 0.0174533), new VehicleColours(24,0));
        server.createVehicle(226,0, new Vector(-702.3112f,-1549.5735f,12.2297f), (float) (65.4440 * 0.0174533), new VehicleColours(25,0));
        server.createVehicle(226,0, new Vector(-698.1317f,-1508.2081f,11.8458f), (float) (341.1898 * 0.0174533), new VehicleColours(26,0));
        server.createVehicle(154,0, new Vector(-1128.2225f,-1284.3130f,11.1889f), (float) (253.5724 * 0.0174533), new VehicleColours(27,0));
        server.createVehicle(219,0, new Vector(-1124.8901f,-1273.1918f,11.4117f), (float) (250.4811 * 0.0174533), new VehicleColours(28,0));
        server.createVehicle(228,0, new Vector(-981.3637f,-1260.1396f,11.3749f), (float) (243.4538 * 0.0174533), new VehicleColours(29,0));
        server.createVehicle(175,0, new Vector(-996.3247f,-1151.8110f,14.5528f), (float) (0.2090 * 0.0174533), new VehicleColours(30,0));
        server.createVehicle(175,0, new Vector(-849.6225f,-910.4603f,10.9575f), (float) (318.5308 * 0.0174533), new VehicleColours(31,0));
        server.createVehicle(132,0, new Vector(-1024.3339f,-866.7787f,12.7786f), (float) (229.1578 * 0.0174533), new VehicleColours(32,0));
        server.createVehicle(206,0, new Vector(-1016.3430f,-859.2415f,17.7203f), (float) (98.5134 * 0.0174533), new VehicleColours(33,0));
        server.createVehicle(226,0, new Vector(-1017.4586f,-869.6252f,17.6932f), (float) (52.9589 * 0.0174533), new VehicleColours(34,0));
        server.createVehicle(132,0, new Vector(-970.1888f,-826.6547f,6.4924f), (float) (96.3465 * 0.0174533), new VehicleColours(35,0));
        server.createVehicle(164,0, new Vector(-1174.9929f,-605.0956f,11.3940f), (float) (277.8358 * 0.0174533), new VehicleColours(36,0));
        server.createVehicle(167,0, new Vector(-1193.1742f,-591.6431f,11.7331f), (float) (183.6476 * 0.0174533), new VehicleColours(37,0));
        server.createVehicle(164,0, new Vector(-1166.1516f,-580.5985f,11.4062f), (float) (189.1212 * 0.0174533), new VehicleColours(38,0));
        server.createVehicle(193,0, new Vector(-858.2284f,-346.7914f,10.5834f), (float) (359.0845 * 0.0174533), new VehicleColours(39,0));
        server.createVehicle(146,0, new Vector(-872.3331f,-488.2375f,11.3151f), (float) (4.7891 * 0.0174533), new VehicleColours(1,3));
        server.createVehicle(206,0, new Vector(-845.3162f,-88.6479f,10.9527f), (float) (332.3133 * 0.0174533), new VehicleColours(42,0));
        server.createVehicle(140,0, new Vector(-766.9658f,119.3257f,10.7898f), (float) (284.2665 * 0.0174533), new VehicleColours(43,0));
        server.createVehicle(154,0, new Vector(-737.6915f,327.5048f,10.9519f), (float) (262.6866 * 0.0174533), new VehicleColours(1,0));
        server.createVehicle(230,0, new Vector(-606.2155f,621.9997f,11.7537f), (float) (87.4708 * 0.0174533), new VehicleColours(2,0));
        server.createVehicle(166,0, new Vector(-605.2299f,652.9457f,10.5659f), (float) (15.9085 * 0.0174533), new VehicleColours(3,0));
        server.createVehicle(166,0, new Vector(-607.8319f,652.2922f,10.5788f), (float) (12.7401 * 0.0174533), new VehicleColours(4,0));
        server.createVehicle(166,0, new Vector(-591.7432f,655.0757f,10.5667f), (float) (12.2588 * 0.0174533), new VehicleColours(5,0));
        server.createVehicle(166,0, new Vector(-588.9980f,655.4834f,10.5647f), (float) (4.9983 * 0.0174533), new VehicleColours(6,0));
        server.createVehicle(191,0, new Vector(-596.9708f,675.4251f,10.7874f), (float) (167.9343 * 0.0174533), new VehicleColours(7,0));
        server.createVehicle(210,0, new Vector(-767.1387f,671.5005f,10.8492f), (float) (83.8082 * 0.0174533), new VehicleColours(8,0));
        server.createVehicle(193,0, new Vector(-787.2767f,677.8641f,10.5768f), (float) (267.2021 * 0.0174533), new VehicleColours(9,0));
        server.createVehicle(132,0, new Vector(-815.9883f,581.2813f,10.6811f), (float) (179.9747 * 0.0174533), new VehicleColours(10,0));
        server.createVehicle(175,0, new Vector(-822.2863f,516.2851f,10.7851f), (float) (89.0889 * 0.0174533), new VehicleColours(11,0));
        server.createVehicle(156,0, new Vector(-665.2367f,770.1137f,10.9188f), (float) (180.4155 * 0.0174533), new VehicleColours(46,1));
        server.createVehicle(157,0, new Vector(-644.9916f,753.7453f,11.2032f), (float) (85.0973 * 0.0174533), new VehicleColours(46,1));
        server.createVehicle(156,0, new Vector(-617.6970f,751.8906f,11.4639f), (float) (85.0973 * 0.0174533), new VehicleColours(46,1));
        server.createVehicle(140,0, new Vector(-477.9304f,865.4980f,11.0699f), (float) (268.1553 * 0.0174533), new VehicleColours(15,0));
        server.createVehicle(175,0, new Vector(-445.2159f,948.3002f,10.9390f), (float) (266.8588 * 0.0174533), new VehicleColours(16,0));
        server.createVehicle(174,0, new Vector(-445.3656f,940.2532f,10.9396f), (float) (272.2660 * 0.0174533), new VehicleColours(17,0));
        server.createVehicle(210,0, new Vector(-397.6784f,895.6395f,10.7032f), (float) (337.5857 * 0.0174533), new VehicleColours(18,0));
        server.createVehicle(173,0, new Vector(-390.3557f,1056.4120f,13.6079f), (float) (359.6460 * 0.0174533), new VehicleColours(19,0));
        server.createVehicle(218,0, new Vector(-466.8355f,1123.2451f,64.7344f), (float) (89.4181 * 0.0174533), new VehicleColours(0,0));
        server.createVehicle(191,0, new Vector(-519.6103f,1134.4745f,10.5881f), (float) (154.2396 * 0.0174533), new VehicleColours(21,0));
        server.createVehicle(146,0, new Vector(-772.4346f,1152.1296f,12.6228f), (float) (357.4167 * 0.0174533), new VehicleColours(1,3));
        server.createVehicle(132,0, new Vector(-866.7917f,1156.2218f,10.7420f), (float) (1.5764 * 0.0174533), new VehicleColours(23,0));
        server.createVehicle(178,0, new Vector(-890.0024f,788.1440f,10.6601f), (float) (176.3324 * 0.0174533), new VehicleColours(24,0));
        server.createVehicle(169,0, new Vector(-878.5630f,857.1202f,10.9624f), (float) (178.5585 * 0.0174533), new VehicleColours(25,0));
        server.createVehicle(174,0, new Vector(-823.1972f,774.1035f,10.9140f), (float) (230.7371 * 0.0174533), new VehicleColours(26,0));
        server.createVehicle(137,0, new Vector(-724.5126f,882.5421f,11.2805f), (float) (87.7349 * 0.0174533), new VehicleColours(3,1));
        server.createVehicle(137,0, new Vector(-725.2592f,870.8182f,11.2797f), (float) (87.6847 * 0.0174533), new VehicleColours(3,1));
        server.createVehicle(198,0, new Vector(-768.2631f,978.4097f,10.7053f), (float) (174.9114 * 0.0174533), new VehicleColours(29,0));
        server.createVehicle(137,0, new Vector(-693.8748f,926.7795f,11.1957f), (float) (271.8885 * 0.0174533), new VehicleColours(3,1));
        server.createVehicle(148,0, new Vector(-1141.5721f,-948.6522f,14.9208f), (float) (91.0539 * 0.0174533), new VehicleColours(31,0));
        server.createVehicle(198,0, new Vector(-1152.7368f,-961.2006f,14.5007f), (float) (270.0034 * 0.0174533), new VehicleColours(32,0));
        server.createVehicle(175,0, new Vector(-1439.7850f,-790.5784f,14.7242f), (float) (268.1172 * 0.0174533), new VehicleColours(33,0));
        server.createVehicle(217,0, new Vector(-1434.2637f,-809.3125f,14.7535f), (float) (358.6395 * 0.0174533), new VehicleColours(34,0));
        server.createVehicle(150,0, new Vector(-1424.9298f,-818.9163f,14.6106f), (float) (310.9636 * 0.0174533), new VehicleColours(35,0));
        server.createVehicle(205,0, new Vector(-1589.8884f,-632.9573f,14.6201f), (float) (177.7569 * 0.0174533), new VehicleColours(36,0));
        server.createVehicle(163,0, new Vector(-1745.5059f,-227.2627f,15.2650f), (float) (268.8552 * 0.0174533), new VehicleColours(37,0));
        server.createVehicle(200,0, new Vector(-1747.4762f,-258.4588f,15.1117f), (float) (271.6740 * 0.0174533), new VehicleColours(38,0));
        server.createVehicle(162,0, new Vector(-1745.9115f,-237.6731f,15.2650f), (float) (272.5596 * 0.0174533), new VehicleColours(39,0));
        server.createVehicle(162,0, new Vector(-1745.9115f,-247.6731f,15.2650f), (float) (272.5596 * 0.0174533), new VehicleColours(39,0));
        server.createVehicle(206,0, new Vector(-949.4357f,-400.9236f,11.8915f), (float) (39.7939 * 0.0174533), new VehicleColours(41,0));
        server.createVehicle(228,0, new Vector(-1034.4214f,-237.0823f,11.4999f), (float) (99.9782 * 0.0174533), new VehicleColours(42,0));
        server.createVehicle(173,0, new Vector(-1065.1829f,-207.4233f,12.0396f), (float) (268.6505 * 0.0174533), new VehicleColours(43,0));
        server.createVehicle(148,0, new Vector(-1188.3468f,-85.6405f,11.5000f), (float) (272.1873 * 0.0174533), new VehicleColours(1,0));
        server.createVehicle(152,0, new Vector(-1042.9720f,12.8570f,11.3690f), (float) (92.1938 * 0.0174533), new VehicleColours(2,0));
        server.createVehicle(178,0, new Vector(-1027.9092f,81.7107f,11.3038f), (float) (348.2765 * 0.0174533), new VehicleColours(3,0));
        server.createVehicle(152,0, new Vector(-1286.4410f,69.9723f,11.5353f), (float) (268.7484 * 0.0174533), new VehicleColours(4,0));
        server.createVehicle(138,0, new Vector(-1260.9946f,95.4438f,12.0189f), (float) (181.0880 * 0.0174533), new VehicleColours(5,0));
        server.createVehicle(198,0, new Vector(-1273.5092f,131.7419f,11.1156f), (float) (178.4533 * 0.0174533), new VehicleColours(6,0));
        server.createVehicle(175,0, new Vector(-1292.0300f,113.8212f,11.3076f), (float) (268.2148 * 0.0174533), new VehicleColours(7,0));
        server.createVehicle(207,0, new Vector(-1090.2170f,105.1514f,10.9564f), (float) (283.7139 * 0.0174533), new VehicleColours(8,0));
        server.createVehicle(174,0, new Vector(-1161.8958f,81.7029f,10.9827f), (float) (89.3327 * 0.0174533), new VehicleColours(9,0));
        server.createVehicle(174,0, new Vector(-1162.3291f,94.9658f,10.9828f), (float) (95.0024 * 0.0174533), new VehicleColours(10,0));
        server.createVehicle(174,0, new Vector(-1180.6656f,89.2420f,10.9829f), (float) (235.1980 * 0.0174533), new VehicleColours(11,0));
        server.createVehicle(150,0, new Vector(-1003.9496f,208.6478f,11.4375f), (float) (172.2168 * 0.0174533), new VehicleColours(12,0));
        server.createVehicle(150,0, new Vector(-995.5876f,192.2060f,11.4201f), (float) (78.8205 * 0.0174533), new VehicleColours(13,0));
        server.createVehicle(225,0, new Vector(-1005.0124f,330.4431f,11.4134f), (float) (264.9194 * 0.0174533), new VehicleColours(14,0));
        server.createVehicle(227,0, new Vector(-614.1432f,802.8074f,29.6671f), (float) (2.8588 * 0.0174533), new VehicleColours(46,1));
        server.createVehicle(140,0, new Vector(-597.5210f,807.9215f,11.2315f), (float) (273.7689 * 0.0174533), new VehicleColours(20,0));
        server.createVehicle(179,0, new Vector(-6.5977f,1148.5264f,19.4230f), (float) (215.1374 * 0.0174533), new VehicleColours(21,0));
        server.createVehicle(179,0, new Vector(49.8167f,1095.2488f,16.8434f), (float) (155.4630 * 0.0174533), new VehicleColours(22,0));
        server.createVehicle(179,0, new Vector(69.3321f,1076.2542f,15.7305f), (float) (70.3744 * 0.0174533), new VehicleColours(23,0));
        server.createVehicle(132,0, new Vector(18.3968f,1090.4570f,15.1448f), (float) (194.6536 * 0.0174533), new VehicleColours(24,0));
        server.createVehicle(132,0, new Vector(-71.4722f,947.0005f,10.6316f), (float) (266.2414 * 0.0174533), new VehicleColours(25,0));
        server.createVehicle(210,0, new Vector(-43.6829f,935.7428f,10.7233f), (float) (357.7755 * 0.0174533), new VehicleColours(26,0));
        server.createVehicle(191,0, new Vector(-34.4179f,935.7580f,10.4625f), (float) (352.8502 * 0.0174533), new VehicleColours(27,0));
        server.createVehicle(205,0, new Vector(-58.7381f,956.5725f,10.6978f), (float) (267.5349 * 0.0174533), new VehicleColours(28,0));
        server.createVehicle(219,0, new Vector(-29.0658f,985.7975f,11.0414f), (float) (165.2962 * 0.0174533), new VehicleColours(29,0));
        server.createVehicle(169,0, new Vector(-18.4378f,948.9335f,10.8173f), (float) (87.2896 * 0.0174533), new VehicleColours(30,0));
        server.createVehicle(169,0, new Vector(-964.5980f,140.3346f,8.9691f), (float) (269.0829 * 0.0174533), new VehicleColours(31,0));
        server.createVehicle(132,0, new Vector(96.2713f,245.7168f,21.5341f), (float) (117.0382 * 0.0174533), new VehicleColours(32,0));
        server.createVehicle(210,0, new Vector(120.5981f,253.6414f,21.3735f), (float) (103.6756 * 0.0174533), new VehicleColours(33,0));
        server.createVehicle(223,0, new Vector(-142.0766f,1022.3281f,7.4496f), (float) (5.0845 * 0.0174533), new VehicleColours(1,90));
        server.createVehicle(190,0, new Vector(-372.2652f,-216.4774f,7.3608f), (float) (295.0877 * 0.0174533), new VehicleColours(1,35));
        server.createVehicle(190,0, new Vector(604.7895f,-1706.5129f,7.5829f), (float) (332.8387 * 0.0174533), new VehicleColours(1,60));
        server.createVehicle(190,0, new Vector(583.6797f,-1760.7828f,7.2956f), (float) (313.2621 * 0.0174533), new VehicleColours(1,46));
        server.createVehicle(190,0, new Vector(603.4528f,-1774.8110f,7.4699f), (float) (205.4766 * 0.0174533), new VehicleColours(1,14));
        server.createVehicle(190,0, new Vector(-1259.0291f,-1414.6964f,7.4179f), (float) (60.5551 * 0.0174533), new VehicleColours(1,50));  
        server.createVehicle(176,0, new Vector(-374.7828f,-660.0657f,5.7694f), (float) (84.7304 * 0.0174533), new VehicleColours(1,35));
        server.createVehicle(203,0, new Vector(-585.500f,-1481.55f,6.7694f), (float) (84.7304 * 0.0174533), new VehicleColours(1,1));
        server.createVehicle(203,0, new Vector(-602.501f,-1524.69f,6.7694f), (float) (84.7304 * 0.0174533), new VehicleColours(1,1));
        server.createVehicle(220,0, new Vector(-863.3964f,-666.4309f,11.0118f), (float) (183.0777 * 0.0174533), new VehicleColours(0,0));
        server.createVehicle(220,0, new Vector(-859.3964f,-666.2309f,11.011f), (float) (183.0777 * 0.0174533), new VehicleColours(0,0));
        server.createVehicle(147,0, new Vector(-855.4263f,-665.8359f,10.9928f), (float) (182.9855 * 0.0174533), new VehicleColours(0,0));
        server.createVehicle(147,0, new Vector(-851.6715f,-665.4630f,10.9748f), (float) (184.5412 * 0.0174533), new VehicleColours(0,0));
        server.createVehicle(158,0, new Vector(-870.582f,-354.465f,11.1000f), (float) (184.5412 * 0.0174533), new VehicleColours(0,0));
        server.createVehicle(167,0, new Vector(-839.675f,-390.178f,11.1000f), (float) (184.5412 * 0.0174533), new VehicleColours(0,0));
        server.createVehicle(217,0, new Vector(-391.192f,-573.789f,40.0476f), (float) (84.7304 * 0.0174533), new VehicleColours(1,53));
        server.createVehicle(136,0, new Vector(-313.99f,-1267.3f,6.7694f), (float) (84.7304), new VehicleColours(0,0));
        server.createVehicle(184,0, new Vector(-327.99f, -1267.3f,6.7694f), (float) (84.7304), new VehicleColours(0,0));
        server.createVehicle(214,0, new Vector(-340.99f,-1214.3f,6.7694f), (float) (84.7304), new VehicleColours(0,0));
        server.createVehicle(182,0, new Vector(-325.99f,-1225.73f,6.7694f), (float) (84.7304), new VehicleColours(1,1));
        server.createVehicle(183,0, new Vector(-313.99f,-1225.73f,6.7694f), (float) (84.7304), new VehicleColours(1,1));
        server.createVehicle(160,0, new Vector(-385.422f,-1351.86f,7.0000f), (float) (84.7304), new VehicleColours(33,32));
        server.createVehicle(160,0, new Vector(-385.422f,-1311.36f,7.0000f), (float) (84.7304), new VehicleColours(33,32));
        server.createVehicle(160,0, new Vector(-397.322f,-1351.86f,7.0000f), (float) (84.7304), new VehicleColours(33,32));
        server.createVehicle(160,0, new Vector(-397.322f,-1311.36f,7.0000f), (float) (84.7304), new VehicleColours(33,32));
        server.createVehicle(202,0, new Vector(-326.306f,-1350.96f,6.7694f), (float) (84.7304), new VehicleColours(1,1));
        server.createVehicle(202,0, new Vector(-315.706f,-1350.96f,6.7694f), (float) (84.7304), new VehicleColours(1,1));
        server.createVehicle(202,0, new Vector(-326.306f,-1306.96f,6.7694f), (float) (84.7304), new VehicleColours(1,1));
        server.createVehicle(202,0, new Vector(-315.706f,-1306.96f,6.7694f), (float) (84.7304), new VehicleColours(1,1));
        server.createVehicle(217,0, new Vector(-1127.23f,1512.53f,11.9797f), (float) (84.7304), new VehicleColours(1,1));
        server.createVehicle(155,0, new Vector(-1662.6864f,-225.8795f,15.1687f), (float) (89.3724), new VehicleColours(0,0));
    }
  
    

    public void onPlayerWeaponChange(Player p, int oldWep, int newWep) {

    }

    public void onPlayerMove(Player player, float lastX, float lastY, float lastZ, float newX, float newY, float newZ) {

    }

    public void onPlayerHealthChange(Player player, float lastHP, float newHP) {
        
        if(newHP >= 101){
            player.setHealth(lastHP);
        }
    }

    public void onPlayerArmourChange(Player player, float lastArmour, float newArmour) {
        
         if(newArmour >= 101){
            player.setArmour(lastArmour);
        }
    }

    @Override
    public void onPlayerConnect(Player player) {
        server.sendClientMessage(player, COLOUR_YELLOWISH, "Welcome to the server " + player.getName() + "!");
    }

    @Override
    public void onPlayerModuleList(Player player, String list) {

    }

    @Override
    public boolean onServerInitialise() {

        return true;
    }

    @Override
    public void onServerUnloadScripts() {

    }

    @Override
    public void onServerFrame() {
        timerRegistry.process();
    }

    @Override
    public String onIncomingConnection(String name, String password, String ip) {
        System.out.println("Incoming connection with '" + ip + "'.");
        return name;
    }

    @Override
    public void onPlayerSpawn(Player player) {

    }

    @Override
    public void onPlayerDisconnect(Player player, int reason) {
        
    }

    @Override
    public void onPlayerEnterVehicle(Player player, Vehicle vehicle, int slot) {

    }

    @Override
    public void onPlayerExitVehicle(Player player, Vehicle vehicle) {

    }

    @Override
    public void onVehicleExplode(Vehicle vehicle) {

    }

    @Override
    public boolean onPlayerCommand(Player player, String message) {
        return commandRegistry.processCommand(player, message);
    }

    @Override
    public void onPlayerCrashReport(Player player, String crashLog) {

    }

    @Override
    public void onCheckPointExited(CheckPoint checkPoint, Player player) {

    }

    @Override
    public void onCheckPointEntered(CheckPoint checkPoint, Player player) {

    }

    @Override
    public void onPickupRespawn(Pickup pickup) {

    }

    @Override
    public void onPickupPicked(Pickup pickup, Player player) {

    }

    @Override
    public boolean onPickupPickAttempt(Pickup pickup, Player player) {

        return true;
    }

    @Override
    public void onObjectTouched(GameObject object, Player player) {

    }

    @Override
    public void onObjectShot(GameObject object, Player player, int weaponId) {

    }

    @Override
    public void onVehicleRespawn(Vehicle vehicle) {

    }

    @Override
    public void onVehicleUpdate(Vehicle vehicle, int updateType) {

    }

    @Override
    public void onPlayerSpectate(Player player, Player spectated) {

    }

    @Override
    public void onPlayerKeyBindUp(Player player, int keyBindIndex) {

    }

    @Override
    public void onPlayerKeyBindDown(Player player, int keyBindIndex) {

    }

    @Override
    public boolean onPlayerPrivateMessage(Player player, Player recipient, String message) {
        
        System.out.println("Player " + player.getName() + " to " + recipient.getName() + ": " + message);
        return true;
    }

    @Override
    public boolean onPlayerMessage(Player player, String message) {
        
        System.out.println("Player " + player.getName() + ": " + message);
        return true;
    }

    @Override
    public void onPlayerAwayChange(Player player, boolean isAway) {

    }

    @Override
    public void onPlayerEndTyping(Player player) {

    }

    @Override
    public void onPlayerBeginTyping(Player player) {

    }

    @Override
    public void onPlayerGameKeysChange(Player player, int oldKeys, int newKeys) {

    }

    @Override
    public void onPlayerCrouchChange(Player player, boolean isCrouching) {

    }

    @Override
    public void onPlayerOnFireChange(Player player, boolean isOnFire) {

    }

    @Override
    public void onPlayerActionChange(Player player, int oldAction, int newAction) {

    }

    @Override
    public void onPlayerStateChange(Player player, int oldState, int newState) {

    }

    @Override
    public void onPlayerNameChange(Player player, String oldName, String newName) {

    }

    @Override
    public boolean onPlayerRequestEnterVehicle(Player player, Vehicle vehicle, int slot) {

        return true;
    }

    @Override
    public void onPlayerUpdate(Player player, int updateType) {

    }

    @Override
    public void onPlayerDeath(Player player, Player killer, int reason, int bodyPart) {

    }

    @Override
    public boolean onPlayerRequestSpawn(Player player) {

        return true;
    }

    @Override
    public boolean onPlayerRequestClass(Player player, int classIndex) {

        return true;
    }

    @Override
    public void onClientScriptData(Player player, byte[] data) {
        this.onClientData.onClientScriptData(player, data);
    }

    @Override
    public void onPluginCommand(int identifier, String message) {

    }

    @Override
    public void onServerShutdown() {

    }

}
