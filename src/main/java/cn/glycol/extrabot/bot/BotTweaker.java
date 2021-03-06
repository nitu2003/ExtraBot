package cn.glycol.extrabot.bot;

import cc.moecraft.icq.command.interfaces.IcqCommand;
import cc.moecraft.icq.event.IcqListener;
import cn.glycol.extrabot.bot.server.MixinHttpServer;

/**
 * MixinBot机器人事件监听器
 * @author Taskeren
 */
public interface BotTweaker {
	
	public static final BotTweaker DEFAULT = new BotTweaker() {};

	/**
	 * 在执行 {@link MixinBot#addAccount(String, String, int)} 时被调用，返回 {@code false} 取消添加。
	 */
	public default boolean onAddAccount(MixinBot bot, String name, String postUrl, int postPort) {
		return true;
	};
	
	/**
	 * 在执行 {@link MixinBot#enableCommandManager(String...)} 时被调用，返回 {@code false} 取消添加。
	 */
	public default boolean onEnableCommandManager(MixinBot bot, String...prefixes) {
		return true;
	};
	
	/**
	 * 在执行 {@link MixinHttpServer#start()} 前被调用。<br>
	 * 可能因为没有使用内置 HttpServer 启动，监听失效。
	 */
	public default void onBotStarting(MixinBot bot) {
		
	}
	
	/**
	 * 在执行 {@link MixinHttpServer#stop()} 前被调用。<br>
	 * 可能因为没有使用内置 HttpServer 启动，监听失效。
	 */
	public default void onBotStopping(MixinBot bot) {
		
	}
	
	/**
	 * 在执行 {@link MixinHttpServer#start()} 后被调用。<br>
	 * 可能因为没有使用内置 HttpServer 启动，监听失效。
	 */
	public default void onBotStarted(MixinBot bot) {
		
	};
	
	/**
	 * 在执行 {@link MixinHttpServer#stop()} 后被调用。
	 * 可能因为没有使用内置 HttpServer 启动，监听失效。
	 */
	public default void onBotStopped(MixinBot bot) {
		
	}
	
	/**
	 * 在执行 {@link MixinBot#addCommand(IcqCommand)} 时调用，返回 {@code false} 取消注册。
	 */
	public default boolean onAddCommand(MixinBot bot, IcqCommand command) {
		return true;
	}
	
	/**
	 * 在执行 {@link MixinBot#addEventListenr(IcqListener)} 时调用，返回 {@code false} 取消注册。
	 */
	public default boolean onAddEventListener(MixinBot bot, IcqListener listener) {
		return true;
	}
	
	/**
	 * 在执行 {@link MixinBot#setState(int)} 时调用。
	 */
	public default void onBotStateChanged(MixinBot bot, int state) {
		
	}
	
}
