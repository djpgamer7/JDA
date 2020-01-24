/*
 * Copyright 2015-2019 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.api.events.channel.store.override;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.PermissionOverride;
import net.dv8tion.jda.api.entities.StoreChannel;

import javax.annotation.Nonnull;

/**
 * Indicates that a {@link PermissionOverride} of a {@link StoreChannel} has been deleted.
 *
 * <p>Can be used to retrieve the old override.
 */
public class StoreChannelDeleteOverrideEvent extends GenericStoreChannelOverrideEvent
{
    public StoreChannelDeleteOverrideEvent(@Nonnull JDA api, long responseNumber, @Nonnull StoreChannel channel, @Nonnull PermissionOverride override)
    {
        super(api, responseNumber, channel, override);
    }
}
