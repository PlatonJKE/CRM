package com.ewp.crm.controllers;

import com.ewp.crm.component.util.VKUtil;
import com.ewp.crm.models.Role;
import com.ewp.crm.models.User;
import com.ewp.crm.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@PreAuthorize("hasAnyAuthority('ADMIN', 'OWNER', 'USER')")
@Controller
public class VkController {
    private final UserService userService;
    private VKUtil vkUtil;

    @Autowired
    public VkController(VKUtil vkUtil, UserService userService) {
        this.vkUtil = vkUtil;
        this.userService = userService;
    }

    @RequestMapping(value = "/vk-auth", method = RequestMethod.GET)
    public String vkAuthPage() {
        String uri = vkUtil.receivingTokenUri();
        return "redirect:" + uri;
    }

    String cont = "487000002, " +
            "487000003, " +
            "487000004, " +
            "487000005, " +
            "487000006, " +
            "487000007, " +
            "487000008, " +
            "487000009, " +
            "487000010, " +
            "487000011, " +
            "487000012, " +
            "487000013, " +
            "487000014, " +
            "487000015, " +
            "487000016, " +
            "487000017, " +
            "487000018, " +
            "487000019, " +
            "487000020, " +
            "487000021, " +
            "487000022, " +
            "487000023, " +
            "487000024, " +
            "487000025, " +
            "487000026, " +
            "487000027, " +
            "487000028, " +
            "487000029, " +
            "487000030, " +
            "487000031, " +
            "487000032, " +
            "487000033, " +
            "487000034, " +
            "487000035, " +
            "487000036, " +
            "487000037, " +
            "487000038, " +
            "487000039, " +
            "487000040, " +
            "487000041, " +
            "487000042, " +
            "487000043, " +
            "487000044, " +
            "487000045, " +
            "487000046, " +
            "487000047, " +
            "487000048, " +
            "487000049, " +
            "487000050, " +
            "487000051, " +
            "487000052, " +
            "487000053, " +
            "487000054, " +
            "487000055, " +
            "487000056, " +
            "487000057, " +
            "487000058, " +
            "487000059, " +
            "487000060, " +
            "487000061, " +
            "487000062, " +
            "487000063, " +
            "487000064, " +
            "487000065, " +
            "487000066, " +
            "487000067, " +
            "487000068, " +
            "487000069, " +
            "487000070, " +
            "487000071, " +
            "487000072, " +
            "487000073, " +
            "487000074, " +
            "487000075, " +
            "487000076, " +
            "487000077, " +
            "487000078, " +
            "487000079, " +
            "487000080, " +
            "487000081, " +
            "487000082, " +
            "487000083, " +
            "487000084, " +
            "487000085, " +
            "487000086, " +
            "487000087, " +
            "487000088, " +
            "487000089, " +
            "487000090, " +
            "487000091, " +
            "487000092, " +
            "487000093, " +
            "487000094, " +
            "487000095, " +
            "487000096, " +
            "487000097, " +
            "487000098, " +
            "487000099, " +
            "487000100, " +
            "487006701, " +
            "487006702, " +
            "487006703, " +
            "487006704, " +
            "487006705, " +
            "487006706, " +
            "487006707, " +
            "487006708, " +
            "487006709, " +
            "487006710, " +
            "487006711, " +
            "487006712, " +
            "487006713, " +
            "487006714, " +
            "487006715, " +
            "487006716, " +
            "487006717, " +
            "487006718, " +
            "487006719, " +
            "487006720, " +
            "487006721, " +
            "487006722, " +
            "487006723, " +
            "487006724, " +
            "487006725, " +
            "487006726, " +
            "487006727, " +
            "487006728, " +
            "487006729, " +
            "487006730, " +
            "487006731, " +
            "487006732, " +
            "487006733, " +
            "487006734, " +
            "487006735, " +
            "487006736, " +
            "487006737, " +
            "487006738, " +
            "487006739, " +
            "487006740, " +
            "487006741, " +
            "487006742, " +
            "487006743, " +
            "487006744, " +
            "487006745, " +
            "487006746, " +
            "487006747, " +
            "487006748, " +
            "487006749, " +
            "487006750, " +
            "487006751, " +
            "487006752, " +
            "487006753, " +
            "487006754, " +
            "487006755, " +
            "487006756, " +
            "487006757, " +
            "487006758, " +
            "487006759, " +
            "487006760, " +
            "487006761, " +
            "487006762, " +
            "487006763, " +
            "487006764, " +
            "487006765, " +
            "487006766, " +
            "487006767, " +
            "487006768, " +
            "487006769, " +
            "487006770, " +
            "487006771, " +
            "487006772, " +
            "487006773, " +
            "487006774, " +
            "487006775, " +
            "487006776, " +
            "487006777, " +
            "487006778, " +
            "487006779, " +
            "487006780, " +
            "487006781, " +
            "487006782, " +
            "487006783, " +
            "487006784, " +
            "487006785, " +
            "487006786, " +
            "487006787, " +
            "487006788, " +
            "487006789, " +
            "487006790, " +
            "487006791, " +
            "487006792, " +
            "487006793, " +
            "487006794, " +
            "487006795, " +
            "487006796, " +
            "487006797, " +
            "487006798, " +
            "487006799, " +
            "487006800, " +
            "487002801, " +
            "487002802, " +
            "487002803, " +
            "487002804, " +
            "487002805, " +
            "487002806, " +
            "487002807, " +
            "487002808, " +
            "487002809, " +
            "487002810, " +
            "487002811, " +
            "487002812, " +
            "487002813, " +
            "487002814, " +
            "487002815, " +
            "487002816, " +
            "487002817, " +
            "487002818, " +
            "487002819, " +
            "487002820, " +
            "487002821, " +
            "487002822, " +
            "487002823, " +
            "487002824, " +
            "487002825, " +
            "487002826, " +
            "487002827, " +
            "487002828, " +
            "487002829, " +
            "487002830, " +
            "487002831, " +
            "487002832, " +
            "487002833, " +
            "487002834, " +
            "487002835, " +
            "487002836, " +
            "487002837, " +
            "487002838, " +
            "487002839, " +
            "487002840, " +
            "487002841, " +
            "487002842, " +
            "487002843, " +
            "487002844, " +
            "487002845, " +
            "487002846, " +
            "487002847, " +
            "487002848, " +
            "487002849, " +
            "487002850, " +
            "487002851, " +
            "487002852, " +
            "487002853, " +
            "487002854, " +
            "487002855, " +
            "487002856, " +
            "487002857, " +
            "487002858, " +
            "487002859, " +
            "487002860, " +
            "487002861, " +
            "487002862, " +
            "487002863, " +
            "487002864, " +
            "487002865, " +
            "487002866, " +
            "487002867, " +
            "487002868, " +
            "487002869, " +
            "487002870, " +
            "487002871, " +
            "487002872, " +
            "487002873, " +
            "487002874, " +
            "487002875, " +
            "487002876, " +
            "487002877, " +
            "487002878, " +
            "487002879, " +
            "487002880, " +
            "487002881, " +
            "487002882, " +
            "487002883, " +
            "487002884, " +
            "487002885, " +
            "487002886, " +
            "487002887, " +
            "487002888, " +
            "487002889, " +
            "487002890, " +
            "487002891, " +
            "487002892, " +
            "487002893, " +
            "487002894, " +
            "487002895, " +
            "487002896, " +
            "487002897, " +
            "487002898, " +
            "487002899, " +
            "487002900, " +
            "161001002, " +
            "161001003, " +
            "161001004, " +
            "161001006, " +
            "161001007, " +
            "161001008, " +
            "161001009, " +
            "161001010, " +
            "161001011, " +
            "161001012, " +
            "161001013, " +
            "161001014, " +
            "161001015, " +
            "161001017, " +
            "161001018, " +
            "161001019, " +
            "161001020, " +
            "161001021, " +
            "161001022, " +
            "161001023, " +
            "161001024, " +
            "161001025, " +
            "161001026, " +
            "161001027, " +
            "161001028, " +
            "161001029, " +
            "161001030, " +
            "161001031, " +
            "161001032, " +
            "161001033, " +
            "161001034, " +
            "161001035, " +
            "161001036, " +
            "161001037, " +
            "161001038, " +
            "161001039, " +
            "161001040, " +
            "161001041, " +
            "161001042, " +
            "161001043, " +
            "161001044, " +
            "161001045, " +
            "161001046, " +
            "161001047, " +
            "161001048, " +
            "161001049, " +
            "161001051, " +
            "161001052, " +
            "161001053, " +
            "161001055, " +
            "161001056, " +
            "161001057, " +
            "161001058, " +
            "161001060, " +
            "161001061, " +
            "161001063, " +
            "161001064, " +
            "161001066, " +
            "161001067, " +
            "161001069, " +
            "161001071, " +
            "161001072, " +
            "161001073, " +
            "161001074, " +
            "161001075, " +
            "161001076, " +
            "161001077, " +
            "161001078, " +
            "161001079, " +
            "161001080, " +
            "161001081, " +
            "161001082, " +
            "161001084, " +
            "161001085, " +
            "161001087, " +
            "161001088, " +
            "161001089, " +
            "161001090, " +
            "161001091, " +
            "161001092, " +
            "161001093, " +
            "161001094, " +
            "161001095, " +
            "161001096, " +
            "161001097, " +
            "161001098, " +
            "161001099, " +
            "161001100";

    @RequestMapping(value = "/vk-auth", method = RequestMethod.POST)
    public String vkGetAccessToken(@RequestParam("token") String token) {
        User userFromSession = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userService.get(userFromSession.getId());
        String applicationToken = vkUtil.replaceApplicationTokenFromUri(token);
        user.setVkToken(applicationToken);
        userService.update(user);
        if (user.getAuthorities().contains(new Role("OWNER"))) {
            vkUtil.setApplicationToken(applicationToken);
        }
        return "redirect:/client";
    }
    String contacts = "487000002\n" +
            "487000003\n" +
            "487000004\n" +
            "487000005\n" +
            "487000006\n" +
            "487000007\n" +
            "487000008\n" +
            "487000009\n" +
            "487000010\n" +
            "487000011\n" +
            "487000012\n" +
            "487000013\n" +
            "487000014\n" +
            "487000015\n" +
            "487000016\n" +
            "487000017\n" +
            "487000018\n" +
            "487000019\n" +
            "487000020\n" +
            "487000021\n" +
            "487000022\n" +
            "487000023\n" +
            "487000024\n" +
            "487000025\n" +
            "487000026\n" +
            "487000027\n" +
            "487000028\n" +
            "487000029\n" +
            "487000030\n" +
            "487000031\n" +
            "487000032\n" +
            "487000033\n" +
            "487000034\n" +
            "487000035\n" +
            "487000036\n" +
            "487000037\n" +
            "487000038\n" +
            "487000039\n" +
            "487000040\n" +
            "487000041\n" +
            "487000042\n" +
            "487000043\n" +
            "487000044\n" +
            "487000045\n" +
            "487000046\n" +
            "487000047\n" +
            "487000048\n" +
            "487000049\n" +
            "487000050\n" +
            "487000051\n" +
            "487000052\n" +
            "487000053\n" +
            "487000054\n" +
            "487000055\n" +
            "487000056\n" +
            "487000057\n" +
            "487000058\n" +
            "487000059\n" +
            "487000060\n" +
            "487000061\n" +
            "487000062\n" +
            "487000063\n" +
            "487000064\n" +
            "487000065\n" +
            "487000066\n" +
            "487000067\n" +
            "487000068\n" +
            "487000069\n" +
            "487000070\n" +
            "487000071\n" +
            "487000072\n" +
            "487000073\n" +
            "487000074\n" +
            "487000075\n" +
            "487000076\n" +
            "487000077\n" +
            "487000078\n" +
            "487000079\n" +
            "487000080\n" +
            "487000081\n" +
            "487000082\n" +
            "487000083\n" +
            "487000084\n" +
            "487000085\n" +
            "487000086\n" +
            "487000087\n" +
            "487000088\n" +
            "487000089\n" +
            "487000090\n" +
            "487000091\n" +
            "487000092\n" +
            "487000093\n" +
            "487000094\n" +
            "487000095\n" +
            "487000096\n" +
            "487000097\n" +
            "487000098\n" +
            "487000099\n" +
            "487000100\n" +
            "487006701\n" +
            "487006702\n" +
            "487006703\n" +
            "487006704\n" +
            "487006705\n" +
            "487006706\n" +
            "487006707\n" +
            "487006708\n" +
            "487006709\n" +
            "487006710\n" +
            "487006711\n" +
            "487006712\n" +
            "487006713\n" +
            "487006714\n" +
            "487006715\n" +
            "487006716\n" +
            "487006717\n" +
            "487006718\n" +
            "487006719\n" +
            "487006720\n" +
            "487006721\n" +
            "487006722\n" +
            "487006723\n" +
            "487006724\n" +
            "487006725\n" +
            "487006726\n" +
            "487006727\n" +
            "487006728\n" +
            "487006729\n" +
            "487006730\n" +
            "487006731\n" +
            "487006732\n" +
            "487006733\n" +
            "487006734\n" +
            "487006735\n" +
            "487006736\n" +
            "487006737\n" +
            "487006738\n" +
            "487006739\n" +
            "487006740\n" +
            "487006741\n" +
            "487006742\n" +
            "487006743\n" +
            "487006744\n" +
            "487006745\n" +
            "487006746\n" +
            "487006747\n" +
            "487006748\n" +
            "487006749\n" +
            "487006750\n" +
            "487006751\n" +
            "487006752\n" +
            "487006753\n" +
            "487006754\n" +
            "487006755\n" +
            "487006756\n" +
            "487006757\n" +
            "487006758\n" +
            "487006759\n" +
            "487006760\n" +
            "487006761\n" +
            "487006762\n" +
            "487006763\n" +
            "487006764\n" +
            "487006765\n" +
            "487006766\n" +
            "487006767\n" +
            "487006768\n" +
            "487006769\n" +
            "487006770\n" +
            "487006771\n" +
            "487006772\n" +
            "487006773\n" +
            "487006774\n" +
            "487006775\n" +
            "487006776\n" +
            "487006777\n" +
            "487006778\n" +
            "487006779\n" +
            "487006780\n" +
            "487006781\n" +
            "487006782\n" +
            "487006783\n" +
            "487006784\n" +
            "487006785\n" +
            "487006786\n" +
            "487006787\n" +
            "487006788\n" +
            "487006789\n" +
            "487006790\n" +
            "487006791\n" +
            "487006792\n" +
            "487006793\n" +
            "487006794\n" +
            "487006795\n" +
            "487006796\n" +
            "487006797\n" +
            "487006798\n" +
            "487006799\n" +
            "487006800\n" +
            "487002801\n" +
            "487002802\n" +
            "487002803\n" +
            "487002804\n" +
            "487002805\n" +
            "487002806\n" +
            "487002807\n" +
            "487002808\n" +
            "487002809\n" +
            "487002810\n" +
            "487002811\n" +
            "487002812\n" +
            "487002813\n" +
            "487002814\n" +
            "487002815\n" +
            "487002816\n" +
            "487002817\n" +
            "487002818\n" +
            "487002819\n" +
            "487002820\n" +
            "487002821\n" +
            "487002822\n" +
            "487002823\n" +
            "487002824\n" +
            "487002825\n" +
            "487002826\n" +
            "487002827\n" +
            "487002828\n" +
            "487002829\n" +
            "487002830\n" +
            "487002831\n" +
            "487002832\n" +
            "487002833\n" +
            "487002834\n" +
            "487002835\n" +
            "487002836\n" +
            "487002837\n" +
            "487002838\n" +
            "487002839\n" +
            "487002840\n" +
            "487002841\n" +
            "487002842\n" +
            "487002843\n" +
            "487002844\n" +
            "487002845\n" +
            "487002846\n" +
            "487002847\n" +
            "487002848\n" +
            "487002849\n" +
            "487002850\n" +
            "487002851\n" +
            "487002852\n" +
            "487002853\n" +
            "487002854\n" +
            "487002855\n" +
            "487002856\n" +
            "487002857\n" +
            "487002858\n" +
            "487002859\n" +
            "487002860\n" +
            "487002861\n" +
            "487002862\n" +
            "487002863\n" +
            "487002864\n" +
            "487002865\n" +
            "487002866\n" +
            "487002867\n" +
            "487002868\n" +
            "487002869\n" +
            "487002870\n" +
            "487002871\n" +
            "487002872\n" +
            "487002873\n" +
            "487002874\n" +
            "487002875\n" +
            "487002876\n" +
            "487002877\n" +
            "487002878\n" +
            "487002879\n" +
            "487002880\n" +
            "487002881\n" +
            "487002882\n" +
            "487002883\n" +
            "487002884\n" +
            "487002885\n" +
            "487002886\n" +
            "487002887\n" +
            "487002888\n" +
            "487002889\n" +
            "487002890\n" +
            "487002891\n" +
            "487002892\n" +
            "487002893\n" +
            "487002894\n" +
            "487002895\n" +
            "487002896\n" +
            "487002897\n" +
            "487002898\n" +
            "487002899\n" +
            "487002900\n" +
            "161001002\n" +
            "161001003\n" +
            "161001004\n" +
            "161001006\n" +
            "161001007\n" +
            "161001008\n" +
            "161001009\n" +
            "161001010\n" +
            "161001011\n" +
            "161001012\n" +
            "161001013\n" +
            "161001014\n" +
            "161001015\n" +
            "161001017\n" +
            "161001018\n" +
            "161001019\n" +
            "161001020\n" +
            "161001021\n" +
            "161001022\n" +
            "161001023\n" +
            "161001024\n" +
            "161001025\n" +
            "161001026\n" +
            "161001027\n" +
            "161001028\n" +
            "161001029\n" +
            "161001030\n" +
            "161001031\n" +
            "161001032\n" +
            "161001033\n" +
            "161001034\n" +
            "161001035\n" +
            "161001036\n" +
            "161001037\n" +
            "161001038\n" +
            "161001039\n" +
            "161001040\n" +
            "161001041\n" +
            "161001042\n" +
            "161001043\n" +
            "161001044\n" +
            "161001045\n" +
            "161001046\n" +
            "161001047\n" +
            "161001048\n" +
            "161001049\n" +
            "161001051\n" +
            "161001052\n" +
            "161001053\n" +
            "161001055\n" +
            "161001056\n" +
            "161001057\n" +
            "161001058\n" +
            "161001060\n" +
            "161001061\n" +
            "161001063\n" +
            "161001064\n" +
            "161001066\n" +
            "161001067\n" +
            "161001069\n" +
            "161001071\n" +
            "161001072\n" +
            "161001073\n" +
            "161001074\n" +
            "161001075\n" +
            "161001076\n" +
            "161001077\n" +
            "161001078\n" +
            "161001079\n" +
            "161001080\n" +
            "161001081\n" +
            "161001082\n" +
            "161001084\n" +
            "161001085\n" +
            "161001087\n" +
            "161001088\n" +
            "161001089\n" +
            "161001090\n" +
            "161001091\n" +
            "161001092\n" +
            "161001093\n" +
            "161001094\n" +
            "161001095\n" +
            "161001096\n" +
            "161001097\n" +
            "161001098\n" +
            "161001099\n" +
            "161001100";

    //TODO delete after testing vk targeting
    @RequestMapping(value = "/vk-test", method = RequestMethod.GET)
    public String testVkTargeting() throws Exception {
        //String groupId = vkUtil.createNewAudience("test");
        //vkUtil.addUsersToAudience(groupId, contacts);
        String groupId24 = vkUtil.createNewAudience("oldVersion");
        String query = vkUtil.addUsersToAudience24(groupId24, contacts);
        return "redirect:" + query;
    }
}
