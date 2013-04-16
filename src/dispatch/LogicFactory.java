package dispatch;
import java.util.HashMap;
import java.util.Map;

import logic.LogicBase;
import logic.category.ItemCatGetLogic;
import logic.item.ProductGetLogic;
import logic.recommend.CategoryRecommendItemLogic;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class LogicFactory {

	private static Map<String, LogicBase> map = new HashMap<String, LogicBase>();
	static {
		map.put("itemCatGet", new ItemCatGetLogic());
		map.put("categoryRecommendItem", new CategoryRecommendItemLogic());
		map.put("productGet", new ProductGetLogic());
	}
	
	public static LogicBase getLogicBase(String name) {
		return map.get(name);
	}
}
